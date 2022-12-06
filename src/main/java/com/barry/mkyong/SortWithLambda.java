package com.barry.mkyong;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortWithLambda {

    public static void main(String[] args) {

        List<Developer> listDevs = getDevelopersTwo();

        System.out.println("Before Sort");
        for (Developer dev : listDevs) {
            System.out.println(dev);
        }

        listDevs.sort((Developer o1, Developer o2)-> o1.getAge()- o2.getAge());

        System.out.println("After Sort");
        //lambda here!
        //listDevs.sort(Comparator.comparingInt(Developer::getAge));

       // listDevs.sort(Comparator.comparing(Developer::getName));

        Comparator<Developer> comparing = Comparator.comparing(Developer::getSalary);
        listDevs.sort(comparing);

        listDevs.forEach(System.out::println);

        //More Lambda Examples

        //sort by age

        Collections.sort(listDevs, new Comparator<Developer>() {
            @Override
            public int compare(Developer o1, Developer o2) {
                return o1.getAge()-o2.getAge();
            }
        });

        //lambda
        listDevs.sort((o1,o2)-> o1.getAge() - o2.getAge());

        // Reversed sorting.
        System.out.println("-------------------------");
        Comparator<Developer> salaryComparator = Comparator.comparing(Developer::getSalary);
        listDevs.sort(salaryComparator);
        listDevs.forEach(System.out::println);


    }


    private static List<Developer> getDevelopersTwo() {
        return Arrays.asList( new Developer("mkyong", new BigDecimal("70001"), 33),
                new Developer("alvin", new BigDecimal("80000"), 20),
                new Developer("jason", new BigDecimal("100000"), 10),
                new Developer("iris", new BigDecimal("170000"), 55)
        );
    }
}
