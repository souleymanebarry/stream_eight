package com.barry.mkyong.streamio;

import java.util.Arrays;

public class StreamString {

    public static void main(String[] args) {

        String lines = "I Love Java 8 Stream!";

        // split by space, uppercase, and convert to Array

        String[] result = Arrays.stream(lines.split("\\s+"))
                .map(String::toUpperCase)
                .toArray(String[]::new);

        for (String s: result){
            System.out.println(s);
        }

    }
}
