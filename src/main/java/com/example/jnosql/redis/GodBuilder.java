package com.example.jnosql.redis;

import java.util.Set;

import static java.util.Collections.emptySet;

public final class GodBuilder {

    private String name;

    private String power;

    private Set<String> duties = emptySet();

    public GodBuilder id(String name) {
        this.name = name;
        return this;
    }

    public GodBuilder power(String power) {
        this.power = power;
        return this;
    }

    public GodBuilder duties(Set<String> duties) {
        this.duties = duties;
        return this;
    }

    public God build() {
        God god = new God(name, power, duties);
        return god;
    }
}
