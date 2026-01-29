package com.matias.springboot.app.springboot.app.intelij.controllers;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RestController
public class HelloController {

    @GetMapping("/app/inicio")
    public Map<String, String> inicio(){
        Map<String,String> json = new HashMap<>();

        json.put("message", "Hola mundo Spring Boot API REST");
        json.put("date", new Date().toString());

        return json;
    }

}
