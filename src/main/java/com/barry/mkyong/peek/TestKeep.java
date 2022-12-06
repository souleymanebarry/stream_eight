package com.barry.mkyong.peek;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class TestKeep {

    public static void main(String[] args) {



       List<String> list = Arrays.asList("A", "B", "C", "D");
       /*  long count = list.stream().peek(System.out::println).count();
        System.out.println(count);*/

/*        long count1 = list.stream()
                .filter(x -> !x.isEmpty())
                .peek(System.out::println)
                .count();

        System.out.println("count1: "+ count1);*/


        List<String> result = list.stream()
                .peek(System.out::println)
                .collect(Collectors.toList());

        System.out.println(result.size());

    }
}
