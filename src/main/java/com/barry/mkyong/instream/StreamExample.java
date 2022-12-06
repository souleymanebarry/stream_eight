package com.barry.mkyong.instream;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample {

    public static void main(String[] args) {
        //int[] -> IntStream -> Stream<Integer> -> Integer[]
        int[] num = {3, 4, 5};

        //1. int[] -> IntStream
        IntStream stream = Arrays.stream(num);
        Stream<Integer> boxed = stream.boxed();

        Integer[] result = boxed.toArray(Integer[]::new);

        System.out.println(Arrays.toString(result));


        // one line
        Integer[] oneLineResult = Arrays.stream(num).boxed().toArray(Integer[]::new);
        System.out.println(Arrays.toString(oneLineResult));
    }
}
