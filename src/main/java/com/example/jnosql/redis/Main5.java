package com.example.jnosql.redis;

import javax.enterprise.inject.se.SeContainer;
import javax.enterprise.inject.se.SeContainerInitializer;
import javax.enterprise.util.TypeLiteral;
import java.util.Queue;

public class Main5 {

    public static void main (String[] args) {
        try (SeContainer container = SeContainerInitializer.newInstance().initialize()) {

            Queue<String> gods = container.select(new TypeLiteral<Queue<String>>() {}).get();
            gods.clear();
            System.out.println("Adds new gods");

            gods.add("Artemis");
            gods.add("Diana");
            gods.add("Poseidon");

            gods.forEach(System.out::println);

            System.out.println("Pool element: " + gods.poll());
            System.out.println("Pool element: " + gods.poll());
            System.out.println("Pool element: " + gods.poll());
            System.out.println("Pool element: " + gods.poll());
            System.out.println("Pool element: " + gods.poll());

            gods.forEach(System.out::println);


        }
    }

}
