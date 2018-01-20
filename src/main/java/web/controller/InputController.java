package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class InputController {

    /**
     * 上传excel表格
     * @param file
     * @param creditId
     * @param request
     * @param response
     * @return
     * @throws IOException
     */
    @RequestMapping(value="/img1",method= RequestMethod.POST)
    @ResponseBody
    public  List<Map<String,String>> upload(@RequestParam MultipartFile[] file, Long creditId, HttpServletRequest request, HttpServletResponse response) throws IOException {
        //获取当前用户
        String path = "/img/";
        String realPath = request.getSession().getServletContext().getRealPath(path);

        System.out.println("11");
//        File file = new File(realPath);
//        if (!file.exists()) {//文件夹不存在 创建文件夹
//            file.mkdirs();
//        }
        response.setContentType("text/plain; charset=UTF-8");
        List<Map<String,String>> list = new ArrayList<Map<String,String>>();
        String originalFilename = null;
        System.out.println("10");
        System.out.println(file.length);
        for(MultipartFile myfile : file){
            System.out.println("12");
            Map<String,String> map = new HashMap<String,String>();
            if(myfile.isEmpty()){
                System.out.println("请选择文件后上传!");
                return null;
            }else{
                originalFilename = myfile.getOriginalFilename();
                System.out.println(originalFilename);
                System.out.println(realPath);
                //String extension =FileUtils.getExtension(originalFilename);
                //originalFilename=userId+"_"+System.currentTimeMillis()+"."+FileUtils.getExtension(originalFilename);
                try {
                    myfile.transferTo(new File(realPath, originalFilename));
                    //保存文件路径
                    //creditFileService.insertFile(File.separator+"upload"+File.separator+day+File.separator+originalFilename, companyId, creditId);
                    map.put("pathUrl","img/"+originalFilename);
                    list.add(map);
                    //logger.info("load success " + request.getContextPath()+File.separator+"upload"+File.separator+day+File.separator+originalFilename);
                    //logger.info("leaving upload!");
                }catch (Exception e) {
                    //logger.info("文件[" + originalFilename + "]上传失败,堆栈轨迹如下");
                    e.printStackTrace();
                    //logger.info("文件上传失败，请重试！！");
                    return null;
                }
            }
        }
        return list;
    }
}
