package com.matias.curso.springboot.webapp.springboot_web.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserRestController {

    @GetMapping("/rest/details")
    public Map<String,Object> details() {
        Map<String,Object> response = new HashMap<>();
        response.put("title", "Página de detalles");
        response.put("name", "Matías");
        response.put("lastname", "Coco");
        return response;
    }
}
