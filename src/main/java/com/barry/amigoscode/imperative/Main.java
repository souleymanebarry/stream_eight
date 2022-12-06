package com.barry.amigoscode.imperative;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static com.barry.amigoscode.imperative.Main.Person.Gender.FEMALE;
import static com.barry.amigoscode.imperative.Main.Person.Gender.MALE;

public class Main {

    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("John",MALE),
                new Person("Maria",FEMALE),
                new Person("Aisha", FEMALE),
                new Person("Alex", MALE),
                new Person("Alice", FEMALE)
        );

        //imperative approach

        List<Person> females = new ArrayList<>();

        for(Person person : people) {
            if (FEMALE.equals(person.gender)){
                females.add(person);
            }
        }

        System.out.println("-------imperative approach----------");

        for(Person female : females) {
            System.out.println(female);
        }


        // functional approach
        System.out.println("-------functional approach----------");
        people.stream()
                .filter(person -> FEMALE.equals(person.gender))
                .collect(Collectors.toList()).forEach(System.out::println);

    }



    static class Person {
        private final String name;
        private final Gender gender;

        Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        enum Gender {
            MALE, FEMALE
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
