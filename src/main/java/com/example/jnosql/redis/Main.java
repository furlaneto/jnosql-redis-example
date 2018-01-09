package com.example.jnosql.redis;

import org.jnosql.artemis.key.KeyValueTemplate;

import javax.enterprise.inject.se.SeContainer;
import javax.enterprise.inject.se.SeContainerInitializer;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import static java.util.Collections.singleton;

public class Main {

    public static void main (String[] args) {
        try (SeContainer container = SeContainerInitializer.newInstance().initialize()) {
            Set<String> duties = new HashSet<>();
            duties.add("music");
            duties.add("poetry");
            duties.add("medicine");

            God apollo = God.builder()
                    .id("Apollo")
                    .power("Sun")
                    .duty(duties)
                    .build();

            KeyValueTemplate keyValueTemplate = container.select(KeyValueTemplate.class).get();

            God godSaved = keyValueTemplate.put(apollo);
            System.out.println(godSaved);

            Optional<God> godFound = keyValueTemplate.get("Apollo", God.class);
            System.out.println(godFound);
        }
    }

}
