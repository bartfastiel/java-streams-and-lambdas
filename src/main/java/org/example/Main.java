package org.example;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> fruits = List.of("Apple", "Banana", "Grapes", "Orange", "Mango");

//        for (String fruit : fruits) {
//            if (fruit.contains("p")) {
//                System.out.println(fruit);
//            }
//        }

        fruits.stream()
                .filter(aFruit -> aFruit.contains("p"))
                .forEach(System.out::println);
    }
}