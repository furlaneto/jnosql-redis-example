package com.example.jnosql.redis;


import org.jnosql.diana.redis.key.Counter;
import org.jnosql.diana.redis.key.SortedSet;

import javax.enterprise.inject.se.SeContainer;
import javax.enterprise.inject.se.SeContainerInitializer;

public class Main7 {

    public static void main (String[] args) {
        try (SeContainer container = SeContainerInitializer.newInstance().initialize()) {

            SortedSet gods = container.select(SortedSet.class).get();
            gods.add("Artemis", 10);
            gods.add("Hera", 5);
            gods.add("Zeus", 2);
            gods.add("Apollo", 1);

            System.out.println("The ranking:");
            gods.getRanking().forEach(System.out::println);

            System.out.println("The reverse ranking:");
            gods.getRevRanking().forEach(System.out::println);

            System.out.println("The worse goods: " + gods.range(0, 1));
            System.out.println("The best ones: " + gods.revRange(0, 1));

        }
    }

}
