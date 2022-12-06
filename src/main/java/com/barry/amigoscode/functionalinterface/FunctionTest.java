package com.barry.amigoscode.functionalinterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionTest {

    public static void main(String[] args) {

        // Function takes 1 argument and produces 1 result
        int increment = incrementByOne(1);
        System.out.println(increment);

        Integer increment2 = incrementByOneFunction.apply(1);
        System.out.println(increment2);

        Integer multiply = multiplyByTenFunction.apply(increment2);
        System.out.println("multiply: "+multiply);

        Function<Integer, Integer> andThen = incrementByOneFunction.andThen(multiplyByTenFunction);
        System.out.println(andThen.apply(1));


        //BiFunction takes 2 arguments and produces 1 result
        System.out.println(
                incrementByOneAndMultiplyBiFunction.apply(4,100)
        );

    }

    static Function<Integer,Integer> incrementByOneFunction = number ->
            number+ 1;

    static Function<Integer,Integer> multiplyByTenFunction = number ->
            number* 10;

    static BiFunction<Integer, Integer,Integer>  incrementByOneAndMultiplyBiFunction =
            (numberIncrementByOne, numberToMultiplyBy) -> (numberIncrementByOne + 1) * numberToMultiplyBy;


    static int incrementByOneAndMultiply(int number, int numToMultiplyBy){
        return (number + 1) * numToMultiplyBy;
    }
    static int incrementByOne(int number){
        return number + 1;
    }
}
