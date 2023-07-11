package com.roses.checkin.person.registration.model;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Person {

    private String name;

    private LocalDate birthday;

    private Phone phone;

    private String email;

    private Address address;

    private Document document;

}
