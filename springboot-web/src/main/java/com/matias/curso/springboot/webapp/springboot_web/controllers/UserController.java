package com.matias.curso.springboot.webapp.springboot_web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.matias.curso.springboot.webapp.springboot_web.modals.User;


@Controller
public class UserController {

    @GetMapping("/app/details")
    public String details(Model model) {
        User user = new User("Matías", "Coco", "matias@gmail.com");
        model.addAttribute("title", "Página de detalles");
        model.addAttribute("user", user);
        return "details";
    }
}
