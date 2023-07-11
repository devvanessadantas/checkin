package com.roses.checkin.person.registration.model;

import lombok.Data;

@Data
public class Phone {

    private Long id;

    private Long idPhoneType;

    private String areaCode;

    private String number;
}
