package com.barry.mkyong.filter;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Java8FindFirstExample2 {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("node", "java", "python", "ruby");

        Optional<String> result = list.stream().filter(x -> !"node".equalsIgnoreCase(x))
                .findFirst();
        result.ifPresent(System.out::println);

        List<Integer> list2 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Optional<Integer> any = list2.stream().filter(x -> x > 1).findAny();
        System.out.println("---------------------------");
        any.ifPresentOrElse(System.out::println,
             ()-> System.out.println("Not found")
        );
    }
}
