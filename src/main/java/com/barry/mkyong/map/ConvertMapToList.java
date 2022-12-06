package com.barry.mkyong.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ConvertMapToList {

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("1", "linode.com");
        map.put("2", "heroku.com");

        // Convert all Map keys to a List

        List<?> result = List.of(map.keySet());
        System.out.println("Map to List: "+result);
        List<?> result2 = List.of(map.values());
        System.out.println("Map to List: "+result2);

        // Java 8, Convert all Map keys to a List

        List<String> stringList = map.values().stream()
                .collect(Collectors.toList());
        stringList.forEach(System.out::println);

        List<String> collect = map.entrySet()
                .stream().map(Map.Entry::getValue)
                .collect(Collectors.toList());
        System.out.println(collect);

        Map<Integer, String> map2 = Map.of(
                10, "apple",
                20, "orange",
                30, "BANANA",
                40, "watermelon",
                50, "dragonfruit");
        System.out.println("-------------------------------------");
        System.out.println("\n1. Export Map Key to List...");

        List<?> result1 = List.of(map.values());

        result1.forEach(System.out::println);


        List<Integer> result4 = map2.entrySet()
                .stream()
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        result4.forEach(System.out::println);

        System.out.println("\n3. Export Map Value to List..., say no to banana");

        map2.values().stream()
                .filter(x-> !"banana".equalsIgnoreCase(x)).collect(Collectors.toList());

    }
}
