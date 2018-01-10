package com.example.jnosql.redis;


import javax.enterprise.inject.se.SeContainer;
import javax.enterprise.inject.se.SeContainerInitializer;
import javax.enterprise.util.TypeLiteral;
import java.util.Map;

public class Main6 {

    public static void main(String[] args) {
        try (SeContainer container = SeContainerInitializer.newInstance().initialize()) {

            Map<String, String> gods = container.select(new TypeLiteral<Map<String, String>>() {
            }).get();

            gods.clear();

            gods.put("hunt", "Artemis");
            gods.put("Sun", "Apollo");
            gods.put("Sea", "Poseidon");


            System.out.println("hunt: " + gods.get("hunt"));
            System.out.println("Sun: " + gods.get("Sun"));
            System.out.println("Sea: " + gods.get("Sea"));
            System.out.println("the keys: " + gods.keySet());

        }
    }

}
