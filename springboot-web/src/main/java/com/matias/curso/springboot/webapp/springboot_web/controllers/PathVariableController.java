package com.matias.curso.springboot.webapp.springboot_web.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.matias.curso.springboot.webapp.springboot_web.modals.dto.ParamDto;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/api/var")
public class PathVariableController {

    @GetMapping("/baz/{message}")
    public ParamDto baz(@PathVariable String message) {
        ParamDto param = new ParamDto();

        param.setMessage(message);

        return param;
    }
    
}
