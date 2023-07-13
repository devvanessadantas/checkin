package com.roses.checkin.person.registration.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Data
@Entity
@Table(name = "phone")
public class Phone {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_phone")
    private UUID id;

    private Long idPhoneType;

    private String areaCode;

    private String number;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "id_pessoa")
    private Person person;
}
