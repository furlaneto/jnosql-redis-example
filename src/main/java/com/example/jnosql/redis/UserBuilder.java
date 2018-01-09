package com.example.jnosql.redis;

import java.util.Collections;
import java.util.List;

public final class UserBuilder {

    private String name;

    private String power;

    private List<String> duty = Collections.emptyList();

    public UserBuilder id(String name) {
        this.name = name;
        return this;
    }

    public UserBuilder power(String username) {
        this.power = username;
        return this;
    }

    public UserBuilder duty(List<String> duty) {
        this.duty = duty;
        return this;
    }

    public God build() {
        God god = new God(name, power, duty);
        return god;
    }
}
