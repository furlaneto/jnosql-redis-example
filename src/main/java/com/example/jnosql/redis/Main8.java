package com.example.jnosql.redis;


import org.jnosql.diana.redis.key.Counter;

import javax.enterprise.inject.se.SeContainer;
import javax.enterprise.inject.se.SeContainerInitializer;

public class Main6 {

    public static void main (String[] args) {
        try (SeContainer container = SeContainerInitializer.newInstance().initialize()) {

            Counter gods = container.select(Counter.class).get();
            System.out.println("increment: " + gods.increment());
            System.out.println("increment: " + gods.increment(2));
            System.out.println("decrement: " + gods.decrement(2));



        }
    }

}
