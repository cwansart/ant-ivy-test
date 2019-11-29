package de.cwansart.application;

import de.cwansart.domain.User;

import javax.faces.bean.SessionScoped;

@SessionScoped
public class UserDTO {

    private String username;

    private String password;

    public UserDTO() {
    }

    public UserDTO(User user) {
        this.username = user.getUsername();
        this.password = user.getPassword();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
