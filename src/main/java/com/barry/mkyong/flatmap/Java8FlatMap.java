package com.barry.mkyong.flatmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8FlatMap {

    public static void main(String[] args) {
        String[][] arrays = new String[][]{{"a", "b"}, {"c", "d"}, {"e", "f"}};

        // Java 8
        List<String> stringList = Stream.of(arrays)
                .flatMap(Arrays::stream)
                .collect(Collectors.toList());

        stringList.forEach(System.out::println);

        //otherwise

        String[] result2 = Stream.of(arrays)
                .flatMap(Stream::of)
                .filter(x -> !"a".equals(x))
                .toArray(String[]::new);
        System.out.println("---------------------------");
        for (String s: result2){
            System.out.println(s);
        }

    }
}
