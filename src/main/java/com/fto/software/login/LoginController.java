package com.fto.software.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

    @RequestMapping("login")
    public String getWelcomePage(){
        return "login";
    }
}
