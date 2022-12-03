package com.alaa.springbootmongodb;

import lombok.Data;

@Data // lombok annotation to add constructor, getter and setter....
public class Address {
    private String country;
    private String city;
    private String postCode;
}
