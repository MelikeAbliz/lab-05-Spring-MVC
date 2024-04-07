package com.cydeo.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public class LoginController {
    @GetMapping("/login/{email}/{phone}")
    public String loginPage(Model model, @PathVariable String email, @PathVariable String phone){
        model.addAttribute("email",email);
        model.addAttribute("phoneNumber",phone);
        model.addAttribute("loginMessage","Login Successful");
        return "login/login-info";
    }

}
