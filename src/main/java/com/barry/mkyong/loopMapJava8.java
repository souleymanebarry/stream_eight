package com.barry.mkyong;

import java.util.HashMap;
import java.util.Map;

public class loopMapJava8 {

    //For the Map‘s key or value containing null, the forEach will print null.

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 10);
        map.put("B", 20);
        map.put("C", 30);
        map.put(null, 40);
        map.put("E", null);
        map.put("F", 60);

/*        if (map!=null){
            map.forEach((k,v)-> System.out.println("key: "+k+", value: "+v));
        }*/

        // If we do not want to print the null key, add a simple null checking inside the forEach.
        map.forEach(
                (k,v)->{
                    //yes we can put logic here
                    if(k!=null && v!= null){
                        System.out.println("key: "+v+", value: "+k);
                    }
                }
        );
    }
}
