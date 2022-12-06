package com.barry.mkyong.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.joining;

public class MapStreams {

    public static void main(String[] args) {
        List<String> alpha = List.of("a", "b", "c", "d");

        //Before Java8
        List<String> alphaUpper = new ArrayList<>();
        for (String s: alpha){
            alphaUpper.add(s.toUpperCase());
        }

        System.out.println(alpha); //[a, b, c, d]
        System.out.println(alphaUpper); //[A, B, C, D]
        System.out.println("functional approach");
        String collect = alpha.stream().map(String::toUpperCase)
                .collect(joining(",", "[", "]"));
        System.out.println("otherwise");
        System.out.println(collect);

        //Extra, streams apply to any data type.
        System.out.println("-----------------------------");

        List<Integer> num = Arrays.asList(1,2,3,4,5);

        List<Integer> collect1 = num.stream().map(n -> n * 2).collect(Collectors.toList());
        System.out.println(collect1); //[2, 4, 6, 8, 10]
    }

}
