package com.barry.mkyong.flatmap;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.MatchResult;
import java.util.stream.Collectors;

public class Java9Example1 {

    public static void main(String[] args) {

        List<String> numbers = Arrays.asList("1", "2", "A", "B", "C1D2E3");

        List<String> collect = numbers.stream()
                .map(x -> new Scanner(x).findAll("\\D+")
                        .map(MatchResult::group)
                        .collect(Collectors.toList())
                ).flatMap(List::stream)
                        .collect(Collectors.toList());

        collect.forEach(System.out::println);
    }
}
