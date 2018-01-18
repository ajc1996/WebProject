package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import web.model.SmUser;
import web.service.LoginService;

import javax.annotation.Resource;

@Controller
public class LoginController {

    @Resource
    LoginService loginService;

    @RequestMapping("checkLogin")
    public @ResponseBody String CheckLogin(SmUser smUser){
        String Result = "false";
        if(loginService.CheckLogin(smUser)){
            Result = "success";
        }
        return Result;
    }

    /**
     * 跳转到主页
     * @return
     */
    @RequestMapping("toindex")
    public String toindex(){
        return  "index";
    }
}
