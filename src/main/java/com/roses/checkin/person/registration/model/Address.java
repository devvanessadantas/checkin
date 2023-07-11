package com.roses.checkin.person.registration.model;

import lombok.Data;

@Data
public class Address {

    private String address;

    private Integer number;

    private String complement;

    private String zipcode;

    private String city;

    private String uf;

    private String country;

}
