package com.example.jnosql.redis;

import java.util.Optional;

import javax.enterprise.inject.se.SeContainer;
import javax.enterprise.inject.se.SeContainerInitializer;
import org.jnosql.artemis.key.KeyValueTemplate;

public class Main {

    public static void main (String[] args) {
        try (SeContainer container = SeContainerInitializer.newInstance().initialize()) {
            God user = God.builder()
                    .id(1)
                    .power("furlaneto")
                    .password("123")
                    .build();

            KeyValueTemplate keyValueTemplate = container.select(KeyValueTemplate.class).get();

            God userSaved = keyValueTemplate.put(user);
            System.out.println(userSaved);

            Optional<God> userInRedis = keyValueTemplate.get(1, God.class);
            System.out.println(userInRedis);
        }
    }

}
