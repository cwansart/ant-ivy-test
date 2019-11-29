package de.cwansart.application;

import de.cwansart.domain.UserService;

import javax.annotation.PostConstruct;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;

@Named
@ViewScoped
public class UserController implements Serializable {

    @Inject
    private UserService service;

    private UserDTO user;

    @PostConstruct
    public void init() {
        this.user = new UserDTO(service.getUser());
    }

    public UserDTO getUser() {
        return user;
    }

    public void setUser(UserDTO user) {
        this.user = user;
    }

    public String getGreeting() {
        if (user.getUsername() != null) {
            return String.format("Hello %s", user.getUsername());
        }

        return "Hello";
    }

    public String saveUser() {
        return null;
    }
}
