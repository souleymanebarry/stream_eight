package com.barry.mkyong.groupby;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.math.BigDecimal;


@Data@AllArgsConstructor @NoArgsConstructor @ToString
public class Item {
    private String name;
    private int qty;
    private BigDecimal price;

}
