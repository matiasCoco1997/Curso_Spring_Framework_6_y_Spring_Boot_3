package com.matias.curso.springboot.webapp.springboot_web.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
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


    @GetMapping("/app/list")
    public String list(ModelMap model) {
        List<User> users = Arrays.asList(
            new User("Matias", "Coco", "Matias@gmail.com"), 
            new User("Rocio", "Pallares"), 
            new User("Agustina", "Coco"));
        model.addAttribute("users",users);
        model.addAttribute("title","Lista de usuarios");
        return "list";
    }
}
