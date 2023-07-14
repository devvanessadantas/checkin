package com.roses.checkin.person.registration.model.dto;

import com.fasterxml.jackson.annotation.JsonValue;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class CustomerRequestDto implements Serializable {

    private String name;
    private String email;
}
