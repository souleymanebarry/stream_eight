package com.barry.mkyong;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class Java8MethodReference1c {

    public static void main(String[] args) {

        List<Employee> list = Arrays.asList(
                new Employee("mkyong", 38, BigDecimal.valueOf(3800)),
                new Employee("zilap", 5, BigDecimal.valueOf(100)),
                new Employee("ali", 25, BigDecimal.valueOf(2500)),
                new Employee("unknown", 99, BigDecimal.valueOf(9999)));

        // method reference

        ComparatorProvider provider = new ComparatorProvider();
        list.sort(provider::compareBySalary);

        list.forEach(System.out::println);


    }


    static class ComparatorProvider {
        public int compareByAge(Employee o1, Employee o2) {
            return o1.getAge().compareTo(o2.getAge());
        }

        public int compareByName(Employee o1, Employee o2) {
            return o1.getName().compareTo(o2.getName());
        }

        public int compareBySalary(Employee o1, Employee o2) {
            return o1.getAge().compareTo(o2.getAge());
        }
    }
}
