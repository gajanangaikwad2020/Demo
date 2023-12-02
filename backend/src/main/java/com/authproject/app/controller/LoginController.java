package com.authproject.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    
    @GetMapping("/login")
    public String login() {
        return " To access the ownit course <br><button onClick=\"Click Here()\" class=\"btn btn-primary\">Click Here</button>\r\n";
                
    }
    
}
