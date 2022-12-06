package com.barry.amigoscode.functionalinterface;

import java.util.List;
import java.util.function.Supplier;

public class SupplierTest {

    public static void main(String[] args) {
        System.out.println(getDBConnectionURL());
        System.out.println(getDBConnectionURLsSupplier.get());
    }

    static  String getDBConnectionURL(){
        return "jdbc://localhost:5432/users";
    }

    static Supplier<List<String>> getDBConnectionURLsSupplier = ()->
            List.of("jdbc://localhost:5432/users",
                    "jdbc://localhost:5432/customers");
}
