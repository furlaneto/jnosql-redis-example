package com.example.jnosql.redis;

import java.io.Serializable;

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
    public boolean equals (final Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        final User user = (User) o;

        if (id != null ? !id.equals(user.id) : user.id != null)
            return false;
        if (username != null ? !username.equals(user.username) : user.username != null)
            return false;
        return password != null ? password.equals(user.password) : user.password == null;
    }

    @Override
    public int hashCode () {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        return result;
    }

    @Override
    public String toString () {
        final StringBuilder builder = new StringBuilder()
                .append("User [")
                .append("id=")
                .append(id)
                .append(",username=\"")
                .append(username).append("\"")
                .append(",password=\"")
                .append(password).append("\"")
                .append("]");
        return builder.toString();
    }
}
