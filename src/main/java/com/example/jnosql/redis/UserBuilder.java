package com.example.jnosql.redis;

import java.util.Set;

import static java.util.Collections.emptySet;

public final class UserBuilder {

    private String name;

    private String power;

    private Set<String> duty = emptySet();

    public UserBuilder id(String name) {
        this.name = name;
        return this;
    }

    public UserBuilder power(String power) {
        this.power = power;
        return this;
    }

    public UserBuilder duty(Set<String> duty) {
        this.duty = duty;
        return this;
    }

    public God build() {
        God god = new God(name, power, duty);
        return god;
    }
}
