package com.example.jnosql.redis;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

import org.jnosql.artemis.Entity;
import org.jnosql.artemis.Id;

@Entity
public class God implements Serializable {

    @Id
    private String id;

    private String power;

    private List<String> duty;

    God(String id, String power, List<String> duty) {
        this.id = id;
        this.power = power;
        this.duty = duty;
    }

    God() {
    }

    public String getId() {
        return id;
    }

    public String getPower() {
        return power;
    }

    public List<String> getDuty() {
        return duty;
    }

    public static UserBuilder builder () {
        return new UserBuilder();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof God)) {
            return false;
        }
        God user = (God) o;
        return Objects.equals(id, user.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
