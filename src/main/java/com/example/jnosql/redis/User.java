package com.example.jnosql.redis;

import java.io.Serializable;
import java.util.Objects;

import org.jnosql.artemis.Entity;
import org.jnosql.artemis.Id;

@Entity
public class User implements Serializable {

    @Id
    private Integer id;

    private String username;

    private String password;

    public User () {
    }

    public Integer getId () {
        return id;
    }

    public void setId (final Integer id) {
        this.id = id;
    }

    public String getUsername () {
        return username;
    }

    public void setUsername (final String username) {
        this.username = username;
    }

    public String getPassword () {
        return password;
    }

    public void setPassword (final String password) {
        this.password = password;
    }

    public static UserBuilder builder () {
        return new UserBuilder();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof User)) {
            return false;
        }
        User user = (User) o;
        return Objects.equals(id, user.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
