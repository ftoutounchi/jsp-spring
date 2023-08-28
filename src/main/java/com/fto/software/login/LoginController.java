package com.fto.software.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {


    @RequestMapping("login")
    public String getWelcomePage(){
        return "login";
    }
    @RequestMapping(value = "welcome", method = RequestMethod.POST)
    public String getLoggedPage(@ModelAttribute User user){
        String name = user.getName();
        String lname = user.getLname();
        //redirect the page to another endpoint
        return "redirect:todo";
    }



}
