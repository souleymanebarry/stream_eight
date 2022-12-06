package com.barry.mkyong.flatmap;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FlatMapExample4 {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};

        Stream<int[]> streamArray = Stream.of(array);

        IntStream intStream = streamArray.flatMapToInt(Arrays::stream);
        intStream.forEach(System.out::println);

        //flatMapToLong -> LongStream

        long[] arrays = {1, 2, 3, 4, 5, 6};
        System.out.println("-------------------------------");
        Stream<long[]> longStream  = Stream.of(arrays);
        longStream.flatMapToLong(Arrays::stream).forEachOrdered(System.out::println);
    }
}
