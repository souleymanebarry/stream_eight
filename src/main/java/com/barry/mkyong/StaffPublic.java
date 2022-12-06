package com.barry.mkyong;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class StaffPublic {
    private String name;
    private int age;
    private String extra;
}
