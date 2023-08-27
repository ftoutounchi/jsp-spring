package com.fto.software.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {

    @RequestMapping("login")
    //if not refer to a page need to add
    @ResponseBody
    public String getWelcomePage(){
        return "Hello from jsp web";
    }
}
