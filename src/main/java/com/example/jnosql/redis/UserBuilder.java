package com.example.jnosql.redis;

public final class UserBuilder {

    private Integer id;

    private String username;

    private String password;

    public UserBuilder id (Integer id) {
        this.id = id;
        return this;
    }

    public UserBuilder username (String username) {
        this.username = username;
        return this;
    }

    public UserBuilder password (String password) {
        this.password = password;
        return this;
    }

    public User build () {
        User user = new User();
        user.setId(id);
        user.setUsername(username);
        user.setPassword(password);
        return user;
    }
}
