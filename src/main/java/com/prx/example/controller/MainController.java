package com.prx.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/testClass")
public class MainController {
    @GetMapping(path="/testMethod", produces = "application/json")
    public String getString()
    {
        return "Hello Prashant";
    }
}
