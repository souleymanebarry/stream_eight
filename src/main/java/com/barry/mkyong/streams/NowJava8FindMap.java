package com.barry.mkyong.streams;

import java.util.List;

import static com.barry.mkyong.streams.NowJava8.Person;
import static java.util.stream.Collectors.toList;

public class NowJava8FindMap {

    public static void main(String[] args) {

        List<Person> persons = List.of(
                new Person("mkyong", 30),
                new Person("jack", 20),
                new Person("lawrence", 40)
        );

        String name = persons.stream()
                .filter(person -> "jack".equals(person.getName()))
                .map(Person::getName)
                .findAny()
                .orElse(null);
        System.out.println("name: "+name);

        List<String> collect = persons.stream()
                .map(Person::getName)
                .collect(toList());
        System.out.println("------------------------");
        collect.forEach(System.out::println);

    }
}
