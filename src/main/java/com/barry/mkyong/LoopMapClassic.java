package com.barry.mkyong;

import java.util.HashMap;
import java.util.Map;

public class LoopMapClassic {

    public static void main(String[] args) {

        //imperative approach
        System.out.println("--------imperative approach---------");
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 10);
        map.put("B", 20);
        map.put("C", 30);
        map.put("D", 40);
        map.put("E", 50);
        map.put("F", 60);


        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("key: "+entry.getKey()+" value: "+entry.getValue());
        }

        // functional approach
        System.out.println("--------functional approach---------");
        map.forEach((k,v)-> System.out.println("key: "+k.toLowerCase()+" value: "+v));
    }
}
