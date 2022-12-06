package com.barry.mkyong.instream;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Java8Example1 {

    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5};

        //1. int[] -> IntStream
        IntStream stream = Arrays.stream(num);

        // 2. OptionalInt
        OptionalInt first = stream.findFirst();

        // 3. getAsInt()
        int result = first.getAsInt();

        System.out.println(result);                                     // 1

        // one line
        System.out.println(Arrays.stream(num).findFirst().getAsInt());


    }
}
