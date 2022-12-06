package com.barry.generic;

import java.util.ArrayList;
import java.util.List;

public class GenericExample {

    public static void main(String[] args) {
        Printer<Cat> printer = new Printer<>(new Cat());
        printer.print();
        System.out.println("------------Double----------------");
        Printer<Dog> doublePrinter = new Printer<>(new Dog());
        doublePrinter.print();

/*        System.out.println("------------String----------------");
        Printer<String> stringPrinter = new Printer<>("23.5");
        stringPrinter.print();*/

        List<Cat> cats= new ArrayList<>();
        cats.add(new Cat());

    }
}
