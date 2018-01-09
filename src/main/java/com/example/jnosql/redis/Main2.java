package com.example.jnosql.redis;

import java.util.Optional;

import javax.enterprise.inject.se.SeContainer;
import javax.enterprise.inject.se.SeContainerInitializer;
import org.jnosql.artemis.DatabaseQualifier;

public class Main2 {

    public static void main (String[] args) {
        try (SeContainer container = SeContainerInitializer.newInstance().initialize()) {
            User user = User.builder()
                    .id(1)
                    .username("furlaneto")
                    .password("123")
                    .build();

            UserRepository repository = container.select(UserRepository.class, DatabaseQualifier.ofKeyValue()).get();
            User userSaved = repository.save(user);
            System.out.println(userSaved);

            Optional<User> userInRedis = repository.findById(1);
            System.out.println(userInRedis);
        }
    }

}
