package com.example.keycloak.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/demo")
public class Controller {
    @GetMapping
    public String hello() {
        return "Check";
    }

    @GetMapping("/hello-2")
    public String hello2() {
        return "check2";
    }
}
