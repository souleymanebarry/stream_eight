package com.barry.mkyong.filter;

import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8Examples {

    public static void main(String[] args) {
        Stream<String> language = Stream.of("java", "python", "node", null, "ruby", null, "php");


        ///To solve it, uses filter or to remove all null values


        language.filter(Objects::nonNull).collect(Collectors.toList()).forEach(System.out::println);

        System.out.println("---------------------");
        Stream<Integer> number = Stream.of(1, 2, 3, 4, 5);
        number.filter(x-> x!=3).collect(Collectors.toList()).forEach(System.out::println);


    }
}
