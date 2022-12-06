package com.barry.mkyong;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.math.BigDecimal;


@Data @ToString @AllArgsConstructor @NoArgsConstructor
public class Developer {
    private String name;
    private BigDecimal salary;
    private Integer age;
}
