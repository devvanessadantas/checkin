package com.roses.checkin.person.registration.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
import java.util.UUID;

@Data
@Entity
@Table(name = "person")
@Inheritance(strategy=InheritanceType.JOINED)
public class Person {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_person")
    private UUID id;

    private String name;

    private String email;

//    private List<Phone> phones;

//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "id_address")
//    private Address address;
//
//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "id_document")
//    private Document document;

}
