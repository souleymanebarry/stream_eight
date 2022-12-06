package com.barry.mkyong.map;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data @ToString @AllArgsConstructor @NoArgsConstructor
public class Hosting {

    private int Id;
    private String name;
    private long websites;
}
