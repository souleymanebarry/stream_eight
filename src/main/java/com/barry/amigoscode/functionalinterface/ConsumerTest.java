package com.barry.amigoscode.functionalinterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerTest {

    public static void main(String[] args) {

        System.out.println("------Normal java function------");
        Customer customer = new Customer("Maria", "9999999");
        greetCustomer(customer);

        System.out.println("------Function Consumer------");
        greetCustomerConsumer.accept(customer);

        System.out.println("------Function BiConsumer------");
        greetCustomerConsumerV2.accept(customer,true);

        System.out.println("------Normal java Function -----");
        greetCustomerV2(customer, false);

    }

    static void greetCustomer(Customer customer){
        System.out.println("Hello: "+customer.customerName+
                ", thanks for registering  your phone number: "+ customer.customerPhoneNumber);
    }

    static void greetCustomerV2(Customer customer, boolean showPhoneNumber ){
        System.out.println("Hello: "+customer.customerName+
                ", thanks for registering  your phone number: "+
                (showPhoneNumber? customer.customerPhoneNumber : "************"));
    }

    static Consumer<Customer> greetCustomerConsumer  = customer ->
            System.out.println("Hello: "+customer.customerName+
                    ", thanks for registering  your phone number: "+ customer.customerPhoneNumber);

    static BiConsumer<Customer,Boolean> greetCustomerConsumerV2 = (customer, showPhoneNumber)->
            System.out.println("Hello: "+customer.customerName+
                    ", thanks for registering  your phone number: "+
                    (showPhoneNumber? customer.customerPhoneNumber : "************"));

    static class Customer{
        private final String customerName;
        private final String customerPhoneNumber;

        Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }
    }
}
