package com.barry.mkyong;

import java.util.ArrayList;
import java.util.List;

public class LoopListClassicAndJava8 {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        // normal loop
        for (String l : list) {
            System.out.println(l);
        }


        //functional approach
        list.forEach(System.out::println);

    }

}
