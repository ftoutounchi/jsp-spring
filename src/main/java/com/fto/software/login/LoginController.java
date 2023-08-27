package com.fto.software.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

    @RequestMapping("login")
    public ModelAndView getWelcomePage(@RequestParam(name = "name") String name, ModelAndView view){
        view.addObject("name", name);
        view.setViewName("login");
        return view;
    }
}
