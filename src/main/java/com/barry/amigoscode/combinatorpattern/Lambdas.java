package com.barry.amigoscode.combinatorpattern;

import java.util.function.BiFunction;
import java.util.function.Consumer;

public class Lambdas {

    public static void main(String[] args) {
       System.out.println(uppercase.apply("Alex",20));
    }

    static BiFunction<String, Integer, String> uppercase = (name, age)-> {
        if (name.isBlank()) throw new IllegalArgumentException("");
        System.out.println(age);
        return name.toUpperCase();
    };

    static class Service {
        public Consumer<String> blah = s->{

        } ;
    }
}
