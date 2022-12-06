package com.barry.mkyong.flatmap;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.math.BigDecimal;


@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class LineItem {

    private Integer id;
    private String item;
    private Integer qty;
    private BigDecimal price;
    private BigDecimal total;
}
