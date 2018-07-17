package com.sample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @ResponseBody
    @GetMapping(value = "/")
    public String helloWorld() {
        return "Hello World!";
    }
}
