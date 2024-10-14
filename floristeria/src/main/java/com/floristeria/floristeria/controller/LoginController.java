package com.floristeria.floristeria.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String login() {
        return "login";  // Debe corresponder al nombre del archivo login.html en la carpeta templates
    }
}
