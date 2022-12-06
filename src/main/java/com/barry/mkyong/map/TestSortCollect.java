package com.barry.mkyong.map;

import java.util.Comparator;
import java.util.Map;
import java.util.List;
import java.util.LinkedHashMap;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class TestSortCollect {

    public static void main(String[] args) {

        List<Hosting> list = new ArrayList<>();
        list.add(new Hosting(1, "liquidweb.com", 80000));
        list.add(new Hosting(2, "linode.com", 90000));
        list.add(new Hosting(3, "digitalocean.com", 120000));
        list.add(new Hosting(4, "aws.amazon.com ", 200000));
        list.add(new Hosting(5, "mkyong.com", 1));
        list.add(new Hosting(6, "linode.com", 100000));


        // 3. List to Map – Sort & Collect
        Map<String, Long> result =
                list.stream().sorted(Comparator.comparingLong(Hosting::getWebsites).reversed())
                .collect(Collectors.toMap(Hosting::getName, Hosting::getWebsites,
                        (oldValue, newValue) -> oldValue,
                        LinkedHashMap::new));

        System.out.println("Result  : " + result);

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "linode.com");
        map.put(2, "heroku.com");
        map.put(3, "something");

        String result2 = "";

        for (Map.Entry<Integer, String>  entry : map.entrySet()) {

            if ("heroku.com".equals(entry.getValue())){
                result2= entry.getValue();
            }

        }
        System.out.println(result2);

        //With Java 8, you can convert a Map.entrySet() into a stream, follow by a filter() and collect() it.

        //Map -> Stream -> Filter -> String

        String collect1 = map.entrySet().stream()
                .filter(x -> "something".equals(x.getValue()))
                .map(Map.Entry::getValue)
                .collect(Collectors.joining());

        System.out.println("--------------------------------");
        System.out.println("collect1: "+collect1);

        System.out.println("--------------------------------");
        Map<Integer, String> collect = map.entrySet().stream()
                .filter(x -> x.getKey() == 2)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        System.out.println(collect);

    }
}
