package com.barry.mkyong.groupby;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class Java8Example2 {

    public static void main(String[] args) {

        //3 apple, 2 banana, others 1
        List<String> items = Arrays.asList("apple", "apple", "banana","apple", "orange", "banana", "papaya");

        Map<String, Long> result = items.stream().collect(
                groupingBy(Function.identity(), counting())
        );
        System.out.println(result);

        //Sort a map and add to finalMap

        Map<String, Long> finalMap = new LinkedHashMap<>();

        result.entrySet()
                .stream()
                .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                .forEachOrdered(e-> finalMap.put(e.getKey(), e.getValue()));

        System.out.println(finalMap);

    }
}
