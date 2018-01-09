package com.example.jnosql.redis;

import org.jnosql.artemis.Entity;
import org.jnosql.artemis.Id;

import javax.json.bind.annotation.JsonbCreator;
import javax.json.bind.annotation.JsonbProperty;
import java.io.Serializable;
import java.util.Objects;
import java.util.Set;

import static java.util.Objects.requireNonNull;

@Entity
public class God implements Serializable {

    @Id
    private String id;

    private String power;

    private Set<String> duty;

    @JsonbCreator
    public God(@JsonbProperty("id") String id,
        @JsonbProperty("power")String power,
        @JsonbProperty("duty")Set<String> duty) {

        this.id = requireNonNull(id, "id is required");
        this.power = requireNonNull(power, "power is required");;
        this.duty = requireNonNull(duty, "duty is required");;
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

    public static GodBuilder builder () {
        return new GodBuilder();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof God)) {
            return false;
        }
        God god = (God) o;
        return Objects.equals(id, god.id);
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
