package com.barry.generic;

public class GenericExample {

    public static void main(String[] args) {

   /*     IntegerPrinter printer = new IntegerPrinter(23);
        printer.print();
*/
        Printer<Integer> printer = new Printer<>(23);
        printer.print();

    }
}
