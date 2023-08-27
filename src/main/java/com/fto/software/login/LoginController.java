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
        return """
                <html lang="en">
                <head>
                    <meta charset="UTF-8">
                    <title>HTML page</title>
                </head>
                <body>
                    <h2>hello from simple html in java</h2>
                    <h3>created with string block</h2>
                </body>
                </html>
                """;
    }
}
