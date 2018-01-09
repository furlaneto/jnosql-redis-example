package com.example.jnosql.redis;

import org.jnosql.artemis.Entity;
import org.jnosql.artemis.Id;

import java.io.Serializable;
import java.util.Objects;
import java.util.Set;

@Entity
public class God implements Serializable {

    @Id
    private String id;

    private String power;

    private Set<String> duty;

    God(String id, String power, Set<String> duty) {
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

    public Set<String> getDuty() {
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

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("God{");
        sb.append("id='").append(id).append('\'');
        sb.append(", power='").append(power).append('\'');
        sb.append(", duty=").append(duty);
        sb.append('}');
        return sb.toString();
    }
}
