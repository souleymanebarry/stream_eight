package com.barry.mkyong;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Java8MethodReference1a {

    public static void main(String[] args) {


        List<String> list = Arrays.asList("1", "7", "6");
        List<String> list2 = Arrays.asList("A", "B", "C");

        // lambda expression
      //  list.forEach(x -> System.out.println(x));

        //method reference
     //   list.forEach(System.out::println);
        System.out.println("----------------");
        // lambda expression
        list.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList()).forEach(System.out::println);

    }
}
