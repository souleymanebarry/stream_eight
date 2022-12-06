package com.barry.mkyong.filter;

import java.util.Arrays;
import java.util.List;

public class NowJava8 {

    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(
                new Person("mkyong", 30),
                new Person("jack", 20),
                new Person("lawrence", 40)
        );


        Person result = getStudentByName(persons, "jack");
        System.out.println(result);

        //  approach Java or otherwise
        System.out.println("---------------------------");
        Person result1 = persons.stream().filter(line -> "jack".equals(line.getName()))
                .findFirst()
                .orElse(null);

        System.out.println(result1);

        Person result2 = persons.stream()
                .filter(x -> "ahmook".equals(x.getName()))
                .findAny()
                .orElse(null);

        System.out.println(result2);

        // let's go

        System.out.println("-------------------------");
        Person person1 = persons.stream()
                .filter(person -> "jack".equals(person.getName()) && 20 == person.getAge())
                .findAny()
                .orElse(null);

        System.out.println("person1 1 :" + person1);

        //or like this
        System.out.println("----------or like this------------");
        Person person = persons.stream()
                .filter(p -> {
                    if ("jack".equals(p.getName()) && 20 == p.getAge()) {
                        return true;
                    }
                    return false;
                }).findFirst()
                .orElse(null);

        System.out.println("person: "+person);

        //other logic with map

        String name = persons.stream()
                .filter(x -> "jack".equals(x.getName()))
                .map(Person::getName)
                .findAny()
                .orElseThrow(() -> new IllegalArgumentException("Not Found"));

        System.out.println("name: "+name);

    }

    private static Person getStudentByName(List<Person> persons, String name) {
        Person result = null;
        for (Person temp : persons) {
            if (name.equals(temp.getName())) {
                result = temp;
            }
        }
        return result;
    }


}
