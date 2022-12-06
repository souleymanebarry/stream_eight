package com.barry.mkyong;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BeforeJava8 {

    public static void main(String[] args) {
        List<Staff> staff = Arrays.asList(
                new Staff("mkyong", 30, new BigDecimal(10000)),
                new Staff("jack", 27, new BigDecimal(20000)),
                new Staff("lawrence", 33, new BigDecimal(30000))
        );

        List<StaffPublic> result = convertToStaffPublic(staff);
       // System.out.println(result);
        result.forEach(System.out::println);

        // convert inside the map() method directly.

        staff.stream().map(temp->{
            StaffPublic obj =new StaffPublic();
            obj.setName(temp.getName());
            obj.setAge(temp.getAge());
            if ("mkyong".equals(temp.getName())) {
                obj.setExtra("this field is for mkyong only!");
            }
            return obj;
        }).collect(Collectors.toList());
    }

    private static List<StaffPublic> convertToStaffPublic(List<Staff> staff) {

        List<StaffPublic> result = new ArrayList<>();

        for (Staff temp : staff) {

            StaffPublic obj = new StaffPublic();
            obj.setName(temp.getName());
            obj.setAge(temp.getAge());
            if ("mkyong".equals(temp.getName())) {
                obj.setExtra("this field is for mkyong only!");
            }

            result.add(obj);
        }

        return result;

    }
}
