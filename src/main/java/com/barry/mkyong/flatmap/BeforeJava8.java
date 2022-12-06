package com.barry.mkyong.flatmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class BeforeJava8 {

    public static void main(String[] args) {
        int[][] scores = {
                {5,3,6,15,3},
                {5,8,4},
                {18, 14, 2, 9}
        };

        for (int i = 0; i < scores.length; i++){
            for (int j = 0; j < scores[i].length; j++){
                System.out.print(scores[i][j]+" ");
            }
            System.out.println();
        }
        String[][] array = new String[][]{{"a", "b"}, {"c", "d"}, {"e", "f"}};

        //array to a stream
        Stream<String[]> stream1 = Arrays.stream(array);

        //same result
        Stream<String[]> stream2 = Stream.of(array);

/*        stream1.flatMap(Arrays::stream)
                .forEach(System.out::println);*/

        // convert array to a stream

        System.out.println("------------------------");

/*        stream1.flatMap(Arrays::stream)
                .filter(x-> !"a".equals(x))
                .collect(toList()).forEach(System.out::println);*/

        //otherwise

        List<String[]> collect = stream1.filter(x -> {
            for (String s : x) {
                if (!"a".equals(x)) {
                    return true;
                }
            }
            return false;
        }).collect(toList());

        // print array
        System.out.println("print array");
        collect.forEach(x-> System.out.println(Arrays.toString(x)));

    }
}
