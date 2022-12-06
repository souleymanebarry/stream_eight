package com.barry.mkyong.streams;

import java.util.Arrays;
import java.util.List;
import static com.barry.mkyong.streams.NowJava8.Person;
public class MultipleCondition {

    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(
                new Person("mkyong", 30),
                new Person("jack", 20),
                new Person("lawrence", 40)
        );

        Person result = persons.stream()
                .filter(person -> "jack".equals(person.getName()) && 20 == person.getAge())
                .findAny()
                .orElse(null);

        System.out.println("result: "+result);

        //or like this
        Person result2 = persons.stream()
                .filter(p -> {
                    if ("jack".equals(p.getName()) && 20 == p.getAge()) {
                        return true;
                    }
                    return false;
                }).findFirst()
                .orElse(null);

        System.out.println("result2: "+result2);



    }
}
