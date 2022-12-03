package com.alaa.springbootmongodb;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data // lombok annotation to add constructor, getter and setter....
@AllArgsConstructor
public class Address {
    private String country;
    private String city;
    private String postCode;
}
