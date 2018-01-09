package com.example.jnosql.redis;

import java.util.Optional;

import javax.enterprise.inject.se.SeContainer;
import javax.enterprise.inject.se.SeContainerInitializer;
import org.jnosql.artemis.DatabaseQualifier;

public class Main2 {

    public static void main (String[] args) {
        try (SeContainer container = SeContainerInitializer.newInstance().initialize()) {
            God user = God.builder()
                    .id(1)
                    .power("furlaneto")
                    .password("123")
                    .build();

            GodRepository repository = container.select(GodRepository.class, DatabaseQualifier.ofKeyValue()).get();
            God userSaved = repository.save(user);
            System.out.println(userSaved);

            Optional<God> userInRedis = repository.findById(1);
            System.out.println(userInRedis);
        }
    }

}
