package com.barry.mkyong;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.math.BigDecimal;


@Data @ToString @AllArgsConstructor
public class Staff {

    private String name;
    private int age;
    private BigDecimal salary;
}
