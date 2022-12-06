package com.barry.mkyong.sorted;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApplication {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("9", "A", "Z", "1", "B", "Y", "4", "a", "c");

        List<String> sortedList  = list.stream()
                .map(String::toUpperCase)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        sortedList.forEach(System.out::println);
        List<User> sorted2 = users.stream()
                .sorted(Comparator.comparingInt(User::getAge))
                .collect(Collectors.toList());
        sorted2.forEach(System.out::println);

        List<User> sortedList2 = users.stream()
                .sorted(Comparator.comparing(User::getName))
                .collect(Collectors.toList());
        System.out.println("--------------------------");
        sortedList2.forEach(System.out::println);

    }



    static List<User> users = Arrays.asList(
            new User("C", 30),
            new User("D", 40),
            new User("A", 10),
            new User("B", 20),
            new User("E", 50));
}


@Data @AllArgsConstructor @NoArgsConstructor @ToString
class User {

    private String name;
    private int age;

}
