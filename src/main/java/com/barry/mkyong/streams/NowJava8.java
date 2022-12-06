package com.barry.mkyong.streams;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.util.List;

public class NowJava8 {

    public static void main(String[] args) {


        List<String> lines = List.of("spring", "node", "mkyong");

        lines.stream()
                .filter(line -> !"mkyong".equals(line))
                .forEach(System.out::println);


        List<Person> persons = List.of(
                new Person("mkyong", 30),
                new Person("jack", 20),
                new Person("lawrence", 40)
        );
        Person result = getStudentByName(persons, "jack");
        System.out.println("-----------------------");
        System.out.println(result);

        //functional approach
        Person result1 = persons.stream()
                .filter(person -> "jack".equals(person.getName()))
                .findFirst()
                .orElse(null);


        Person result2 = persons.stream()
                .filter(person -> "ahmook".equals(person.getName()))
                .findFirst()
                .orElse(null);
        System.out.println("----------functional approach-------------");
        System.out.println(result1);
        System.out.println(result2);

    }

    private static Person getStudentByName(List<Person> persons,String name){
        Person result = null;
        for(Person person : persons){
            if (name.equals(person.getName())){
                result =person;
            }
        }
        return result;
    }



    @Data @AllArgsConstructor @ToString
    static class Person{

        private String name;
        private int age;

    }
}
