package com.barry.mkyong.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortByKeyExample {

    public static void main(String[] args) {



        Map<String, Integer> unSortMap = new HashMap<>();
        unSortMap.put("z", 10);
        unSortMap.put("b", 5);
        unSortMap.put("a", 6);
        unSortMap.put("c", 20);
        unSortMap.put("d", 1);
        unSortMap.put("e", 7);
        unSortMap.put("y", 8);
        unSortMap.put("n", 99);
        unSortMap.put("g", 50);
        unSortMap.put("m", 2);
        unSortMap.put("f", 9);

        System.out.println("Original...");
        System.out.println(unSortMap);

        System.out.println("--------------------------");

        Map<String, Integer> result = unSortMap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));

        System.out.println(result);

        //otherwise

        //Not recommend, but it works
        //Alternative way to sort a Map by keys, and put it into the 'result' map
        Map<String, Integer> mapFinal = new LinkedHashMap<>();
        unSortMap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .forEachOrdered(x-> mapFinal.put(x.getKey(), x.getValue()));

        System.out.println("Sorted...");
        System.out.println(result);
        System.out.println(mapFinal);
    }

}
