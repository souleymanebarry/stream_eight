package com.barry.mkyong.filter;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8StreamExample {

    public static void main(String[] args) {
        Stream<String> stream = Stream.of("A", "B", "C");

        List<String> collect = stream.filter(x -> !x.equals("B"))
                .collect(Collectors.toList());

        System.out.println(collect);
    }
}
