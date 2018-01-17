package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import web.model.SmUser;

@Controller
public class LoginController {

    @RequestMapping("checkLogin")
    public String CheckLogin(SmUser smUser){
        return "success";
    }

}
