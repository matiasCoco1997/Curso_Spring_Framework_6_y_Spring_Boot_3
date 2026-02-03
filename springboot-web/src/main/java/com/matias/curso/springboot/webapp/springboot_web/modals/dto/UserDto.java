package com.matias.curso.springboot.webapp.springboot_web.modals.dto;

import com.matias.curso.springboot.webapp.springboot_web.modals.User;

public class UserDto {

    private String title;
    private User user;

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }

}
