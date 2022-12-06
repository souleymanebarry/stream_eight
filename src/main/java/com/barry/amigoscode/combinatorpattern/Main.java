package com.barry.amigoscode.combinatorpattern;

import java.time.LocalDate;
import java.time.Month;

import static com.barry.amigoscode.combinatorpattern.CustomerRegistrationValidator.ValidationResult.SUCCESS;
import static com.barry.amigoscode.combinatorpattern.CustomerRegistrationValidator.isAdult;
import static com.barry.amigoscode.combinatorpattern.CustomerRegistrationValidator.isPhoneNumberValid;
import static com.barry.amigoscode.combinatorpattern.CustomerRegistrationValidator.ValidationResult;

public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer(
                "Alice",
                "alice@gmail.com",
                "+070000000",
                LocalDate.of(2000, Month.APRIL, 1)
        );

        System.out.println(new CustomerValidatorService().isValid(customer));

        //If valid we can store customer in db

        //Using combinator pattern
        ValidationResult result = CustomerRegistrationValidator
                .isEmailValid()
                .and(isPhoneNumberValid())
                .and(isAdult())
                .apply(customer);

        System.out.println("result: "+result);
        if (result!=SUCCESS){
            throw new IllegalStateException(result.name());
        }

    }
}
