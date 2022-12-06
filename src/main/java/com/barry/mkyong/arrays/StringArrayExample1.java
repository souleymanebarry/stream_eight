package com.barry.mkyong.arrays;

import java.util.Arrays;
import java.util.List;

public class StringArrayExample1 {

    public static void main(String[] args) {

        String[] alphabet = new String[]{"A", "B", "C"};
        // Convert String Array to List

        List<String> stringList = Arrays.asList(alphabet);
        for (String s: stringList){
            if (s.contains("A")) {
                System.out.println("Hello A");
            }
        }

        // Convert to stream and test it

        boolean match = Arrays.stream(alphabet).anyMatch("A"::equals);
        if (match) {
            System.out.println("Hello A");
        }
    }
}
