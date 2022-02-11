package com.jakemaxell.userdatabaseapi.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;

@Data
@AllArgsConstructor
@Embeddable
public class Address {

    private String street;
    private String city;
    private String state;
    private String zipcode;

    public Address(){

    }

}