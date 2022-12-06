package com.barry.mkyong.map;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class TestMapFilter {

    private static final String AWS = "aws.amazon.com";
    public static void main(String[] args) {

        Map<Integer, String> HOSTING = new HashMap<>();
        HOSTING.put(1, "linode.com");
        HOSTING.put(2, "heroku.com");
        HOSTING.put(3, "digitalocean.com");
        HOSTING.put(4, AWS);

        // Before Java 8
        String result = "";
        for (Map.Entry<Integer, String> entry : HOSTING.entrySet()) {
            if (AWS.equals(entry.getValue())) {
                result = entry.getValue();
            }
        }
        System.out.println("Before Java 8 : " + result);
        //Map -> Stream -> Filter -> String

        String collect = HOSTING.entrySet()
                .stream().filter(x -> AWS.equals(x.getValue()))
                .map(Map.Entry::getValue)
                .collect(Collectors.joining());

        System.out.println("With Java 8 : " + collect);

        // filter more values
        String result3 = HOSTING.values().stream()
                .filter(s -> {
                    if (AWS.equals(s)) {
                        return true;
                    }
                    return false;
                })
                .collect(Collectors.joining());

        System.out.println("With Java 8 : " + result3);

    }
}
