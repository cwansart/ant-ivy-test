package de.cwansart.domain;

import javax.faces.bean.ApplicationScoped;
import java.io.Serializable;

@ApplicationScoped
public class UserService implements Serializable {

    private User user = new User("not set", "not set");

    public User getUser() {
        return user;
    }
}
