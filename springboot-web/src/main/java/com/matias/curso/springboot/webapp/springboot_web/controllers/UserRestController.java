package com.matias.curso.springboot.webapp.springboot_web.controllers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.matias.curso.springboot.webapp.springboot_web.modals.User;
import com.matias.curso.springboot.webapp.springboot_web.modals.dto.UserDto;


@RestController
@RequestMapping("/api")
public class UserRestController {

    @GetMapping("/details-map")
    public Map<String,Object> detailsMap() {
        Map<String,Object> response = new HashMap<>();
        User user = new User("Matías", "Coco");
        response.put("title", "Página de detalles");
        response.put("user", user);
        return response;
    }

    @GetMapping("/details")
    public UserDto details() {
        UserDto userDto = new UserDto();
        User user = new User("Matías", "Coco");
        userDto.setUser(user);
        userDto.setTitle("Página de detalles");
        return userDto;
    }

    @GetMapping("/list")
    public List<User> list() {
        User user1 = new User("Matías", "Coco");
        User user2 = new User("Rocio", "Pallares");
        User user3 = new User("Agustina", "Coco");

        List<User> list = Arrays.asList(user1,user2,user3);
        
        return list;
    }
}
