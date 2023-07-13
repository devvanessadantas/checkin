package com.roses.checkin.person.registration.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.UUID;

@Data
@Entity
@Table(name = "customer")
public class Customer extends Person{

    @Temporal(TemporalType.DATE)
    private LocalDate birthday;

}
