package com.barry.mkyong.flatmap;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import static java.util.stream.Collectors.toSet;

public class FlatMapExample1 {

    public static void main(String[] args) {
        Developer o1 = new Developer();

        o1.setName("mkyong");
        o1.addBook("Java 8 in Action");
        o1.addBook("Spring Boot in Action");
        o1.addBook("Effective Java (3nd Edition)");

        System.out.println(o1);

        Developer o2 = new Developer();
        o2.setName("zilap");
        o2.addBook("Learning Python, 5th Edition");
        o2.addBook("Effective Java (3nd Edition)");
        System.out.println(o2);

        List<Developer> list = Arrays.asList(o1,o2);
        System.out.println("----------------------------");
        Set<String> collect =
                list.stream()
                        .map(Developer::getBook)
                        .flatMap(x -> x.stream())
                        .filter(x -> !x.toLowerCase().contains("python"))
                        .collect(toSet());

        collect.forEach(System.out::println);


        //other approach
        System.out.println("--- other approach ---");
        list.stream()
                .flatMap(x-> x.getBook().stream())
                .filter(x-> !x.toLowerCase().contains("python"))
                .collect(toSet()).forEach(System.out::println);

    }
}
