package com.example.jnosql.redis;

import java.util.Optional;

import javax.enterprise.inject.se.SeContainer;
import javax.enterprise.inject.se.SeContainerInitializer;
import org.jnosql.artemis.key.KeyValueTemplate;

public class Main {

    public static void main (String[] args) {
        try (SeContainer container = SeContainerInitializer.newInstance().initialize()) {
            User user = User.builder()
                    .id(1)
                    .username("furlaneto")
                    .password("123")
                    .build();

            KeyValueTemplate keyValueTemplate = container.select(KeyValueTemplate.class).get();

            User userSaved = keyValueTemplate.put(user);
            System.out.println(userSaved);

            Optional<User> userInRedis = keyValueTemplate.get(1, User.class);
            System.out.println(userInRedis);
        }
    }

}
