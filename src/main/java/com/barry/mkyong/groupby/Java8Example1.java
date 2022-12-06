package com.barry.mkyong.groupby;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Java8Example1 {
        private static final String APPLE = "apple";

    public static void main(String[] args) {
        //3 apple, 2 banana, others 1

        List<String> items = Arrays.asList(APPLE, APPLE, "banana", APPLE, "orange", "banana", "papaya");

        Map<String, Long> result = items.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(result);
    }
}
