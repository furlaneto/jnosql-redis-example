package com.example.jnosql.redis;

import java.util.Set;

import static java.util.Collections.emptySet;

public final class GodBuilder {

    private String name;

    private String power;

    private Set<String> duty = emptySet();

    public GodBuilder id(String name) {
        this.name = name;
        return this;
    }

    public GodBuilder power(String power) {
        this.power = power;
        return this;
    }

    public GodBuilder duty(Set<String> duty) {
        this.duty = duty;
        return this;
    }

    public God build() {
        God god = new God(name, power, duty);
        return god;
    }
}
