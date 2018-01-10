package com.example.jnosql.redis;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import javax.enterprise.inject.se.SeContainer;
import javax.enterprise.inject.se.SeContainerInitializer;
import org.jnosql.artemis.DatabaseQualifier;

public class Main2 {

    public static void main (String[] args) {
        try (SeContainer container = SeContainerInitializer.newInstance().initialize()) {

            Set<String> duties = new HashSet<>();
            duties.add("moon");
            duties.add("hunt");

            God artemis = God.builder()
                    .id("artemis")
                    .power("archery")
                    .duties(duties)
                    .build();


            GodRepository repository = container.select(GodRepository.class, DatabaseQualifier.ofKeyValue()).get();
            God godSaved = repository.save(artemis);
            System.out.println(godSaved);

            Optional<God> godFound = repository.findById("artemis");
            System.out.println(godFound);
        }
    }

}
