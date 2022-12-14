package com.barry.mkyong.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class ForEachConsumer {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("abc", "java", "python");
        Stream<String> stream = Stream.of("abc", "java", "python");

        // convert a String to a Hex
        Consumer<String> printTextInHexConsumer = (String x)->{
            StringBuilder sb = new StringBuilder();
            for (char c : x.toCharArray()){
                String hex = Integer.toHexString(c);
                sb.append(hex);
            }
            System.out.printf("%n%-10s:%s%n",x, sb);
        };

        // pass a Consumer
        list.forEach(printTextInHexConsumer);
        System.out.println("-------------------------------------");

        stream.forEach(printTextInHexConsumer);
    }

}
