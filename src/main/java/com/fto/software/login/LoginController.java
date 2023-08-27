package com.fto.software.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {


    @RequestMapping("login")
    public String getWelcomePage(){
        return "login";
    }
    @RequestMapping(value = "welcome", method = RequestMethod.POST)
    @ResponseBody
    public String getLoggedPage(@RequestParam(name = "name") String name,
                                 @RequestParam(name = "lname") String lname){
        return "logged by " + name + " " + lname;
    }



}
