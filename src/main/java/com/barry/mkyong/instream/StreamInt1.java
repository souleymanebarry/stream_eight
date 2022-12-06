package com.barry.mkyong.instream;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamInt1 {

    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5};

        Integer[] result = Arrays.stream(num)
                .map(x -> x * 2)
                .boxed()
                .toArray(Integer[]::new);
        Arrays.asList(result).forEach(System.out::println);

        // IntStream -> int[]
        int[] stream1 = IntStream.rangeClosed(1, 5).toArray();
        System.out.println("-----------------------------");

        System.out.println(Arrays.toString(stream1));

        Stream<Integer> stream2 = Stream.of(1, 2, 3, 4, 5);
        int[] result2 = stream2.mapToInt(x -> x).toArray();

        System.out.println(Arrays.toString(result2));
    }
}
