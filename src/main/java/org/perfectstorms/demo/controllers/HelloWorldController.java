package org.perfectstorms.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping("/hellow")
    public String hellow(){
        return "Hello world!!!";
    }
}
