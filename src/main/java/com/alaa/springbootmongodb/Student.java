package com.alaa.springbootmongodb;

import lombok.Data;

import java.math.BigDecimal;
import java.time.ZonedDateTime;
import java.util.List;

@Data // lombok annotation to add constructor, getter and setter....
public class Student {
    private String firstName;
    private String lastNamel;
    private String email;
    private Gender gender;
    private Address address;
    private List<String> favouriteSubjects;
    private BigDecimal totalSpentInBooks;
    private ZonedDateTime created;

}
