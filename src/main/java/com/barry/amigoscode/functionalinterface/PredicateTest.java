package com.barry.amigoscode.functionalinterface;

import java.util.function.Predicate;

public class PredicateTest {
    public static void main(String[] args) {
        System.out.println("----------without Predicate------");
        System.out.println(isPhoneNumberValid("07000000001"));
        System.out.println(isPhoneNumberValid("09000097701"));
        System.out.println(isPhoneNumberValid("0900009770100"));

        System.out.println("----------with Predicate------");
        System.out.println(isPhoneNumberValidPredicate.test("07000000001"));
        System.out.println(isPhoneNumberValidPredicate.test("09000097701"));
        System.out.println(isPhoneNumberValidPredicate.test("09000097300"));

        System.out.println(
                "Is phone number valid and contains number 3"+
                isPhoneNumberValidPredicate.and(containsNumber3).test("09000097300")
        );

        System.out.println(
                "Is phone number valid and contains number 3"+
                        isPhoneNumberValidPredicate.and(containsNumber3).test("07000000301")
        );
    }

    static boolean isPhoneNumberValid(String phoneNumber) {
        return phoneNumber.startsWith("07") && phoneNumber.length()==11;
    }

    static Predicate<String> isPhoneNumberValidPredicate = phoneNumber->
            phoneNumber.startsWith("07") && phoneNumber.length()==11;

    static Predicate<String> containsNumber3 = phoneNumber->
            phoneNumber.contains("3");
}
