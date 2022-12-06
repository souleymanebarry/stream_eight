package com.barry.mkyong;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.math.BigDecimal;


@Data @AllArgsConstructor @ToString @NoArgsConstructor
public class Employee {
    String name;
    Integer age;
    BigDecimal salary;
}
