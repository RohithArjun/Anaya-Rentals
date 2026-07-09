package com.ayana.authService.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/auth")
public class LoginController {

    @GetMapping("/login")
    public String login() {
        // Implement login logic here
        return "Login successful for user: ";
    }
}
