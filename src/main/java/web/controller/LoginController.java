package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import web.model.SmUser;
import web.service.LoginService;

import javax.annotation.Resource;

@Controller
public class LoginController {

    @Resource
    LoginService loginService;

    @RequestMapping("checkLogin")
    public String CheckLogin(SmUser smUser){
        String Result = "false";
        if(loginService.CheckLogin(smUser)){
            Result = "success";
        }
        return Result;
    }

}
