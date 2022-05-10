package com.example.loginapidemo.controllers;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @PostMapping("/login")
    public String login(@RequestBody User user) {
        System.out.println(user.username);
        if (user.username.equals("hoang") && user.password.equals("123456")) {
            return "xxxxxxxxooooooo";
        }
        return "errrrrorrrorororo";
    }

    @GetMapping("/webhook")
    public void hook() {

    }



}
