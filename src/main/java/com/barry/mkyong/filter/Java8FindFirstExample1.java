package com.barry.mkyong.filter;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Java8FindFirstExample1 {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 2, 1);

        Optional<Integer> first = list.stream().findFirst();

        if (first.isPresent()) {
            System.out.println(first.get());       // 1
        } else {
            System.out.println("no value?");
        }

        Optional<Integer> first2 = list.stream().filter(x -> x > 1).findFirst();

        first2.ifPresent(System.out::println);
    }
}
