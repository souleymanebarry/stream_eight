package com.barry.mkyong.reduce;

import java.util.Arrays;
public class Test {


    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        for (int i : numbers) {
            sum += i;
        }

        System.out.println("sum : " + sum); // 55

       // The equivalent in Stream.reduce()

        //otherwise
        int reduce = Arrays.stream(numbers).reduce(0, Integer::sum);


        System.out.println("reduce : " + reduce); // 55

        int sum3 = Arrays.stream(numbers).reduce(0, (a, b) -> a - b);
        System.out.println("sum3 : " + sum3); // 55

        int max = Arrays.stream(numbers).reduce(0, Integer::max);
        System.out.println("max : "+max);
        int min = Arrays.stream(numbers).reduce(0, (a, b) -> a < b ? a : b);
        System.out.println("min : "+min);
        int min1 = Arrays.stream(numbers).reduce(0, Integer::min);
        System.out.println("min1 : "+min1);

       // Join String.
        String[] strings = {"a", "b", "c", "d", "e"};

        String reduce1 = Arrays.stream(strings).reduce("", (a, b) -> a + "|" + b);
        System.out.println(reduce1);

        Arrays.stream(strings).reduce("",(a,b)->{
            if(!"".equals(a)){
                return a + "|" + b;
            }
            else{
                return b ;
            }
        });
    }

}
