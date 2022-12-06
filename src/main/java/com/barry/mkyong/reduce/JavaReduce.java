package com.barry.mkyong.reduce;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.List;

public class JavaReduce {

    public static void main(String[] args) {
        List<Invoice> invoices = Arrays.asList(
                new Invoice("A01", BigDecimal.valueOf(9.99), BigDecimal.valueOf(1)),
                new Invoice("A02", BigDecimal.valueOf(19.99), BigDecimal.valueOf(1.5)),
                new Invoice("A03", BigDecimal.valueOf(4.99), BigDecimal.valueOf(2)));


        BigDecimal sum = invoices.stream()
                .map(x -> x.getQty().multiply(x.getPrice()))
                .reduce(BigDecimal.ZERO, BigDecimal::add);

        System.out.println(sum);
        System.out.println("sum "+sum.setScale(2, RoundingMode.HALF_UP));
    }


}



@Data @AllArgsConstructor @NoArgsConstructor
class Invoice {

    String invoiceNo;
    BigDecimal price;
    BigDecimal qty;

    // getters, setters n constructor
}
