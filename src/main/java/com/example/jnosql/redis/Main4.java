package com.example.jnosql.redis;

import javax.enterprise.inject.se.SeContainer;
import javax.enterprise.inject.se.SeContainerInitializer;
import javax.enterprise.util.TypeLiteral;
import java.util.Set;

public class Main4 {

    public static void main (String[] args) {
        try (SeContainer container = SeContainerInitializer.newInstance().initialize()) {

            Set<String> gods = container.select(new TypeLiteral<Set<String>>() {}).get();
            gods.clear();
            System.out.println("Adds new gods");

            gods.add("Artemis");
            gods.add("Diana");
            gods.add("Diana");
            gods.add("Poseidon");

            gods.forEach(System.out::println);
            System.out.println("Removing an element");
            gods.remove("Diana");

            gods.forEach(System.out::println);


        }
    }

}
