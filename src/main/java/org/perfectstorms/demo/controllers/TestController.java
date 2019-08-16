package org.perfectstorms.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/MariaDB")
    public String test(){
        return "";
    }
}
