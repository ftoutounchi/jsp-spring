package com.fto.software.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

    @RequestMapping("login")
    public String getWelcomePage(@RequestParam(name = "name") String name, ModelMap map){
        map.put("name", name);
        return "login";
    }
}
