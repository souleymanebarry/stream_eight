package com.barry.amigoscode.stream;


import java.util.List;

import static com.barry.amigoscode.stream.StreamTest.Person.Gender.*;


public class StreamTest {

    public static void main(String[] args) {

        List<Person> people = List.of(
                new Person("John",MALE),
                new Person("Maria",FEMALE),
                new Person("Aisha", FEMALE),
                new Person("Alex", MALE),
                new Person("Alice", FEMALE),
                new Person("Bob", PREFER_NOT_SAY)
        );

        people.stream()
                .map(person -> person.name)
                .mapToInt(String::length)
                .forEach(System.out::println);

        boolean allMatch = people.stream().anyMatch(person -> PREFER_NOT_SAY.equals(person.gender));
        System.out.println(allMatch);

    }

    static class Person {
        private final String name;
        private final Gender gender;

        Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        enum Gender {
            MALE, FEMALE, PREFER_NOT_SAY
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }
}
