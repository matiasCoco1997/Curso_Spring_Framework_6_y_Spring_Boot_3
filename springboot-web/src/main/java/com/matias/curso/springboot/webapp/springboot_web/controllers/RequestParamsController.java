package com.matias.curso.springboot.webapp.springboot_web.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.matias.curso.springboot.webapp.springboot_web.modals.dto.ParamDto;

import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/api/params")
public class RequestParamsController {

    @GetMapping("/foo")
    public ParamDto foo(@RequestParam String message) {
        ParamDto param = new ParamDto();
        param.setMessage(message);
        return param;
    }
    

}
