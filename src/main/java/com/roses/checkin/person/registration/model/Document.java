package com.roses.checkin.person.registration.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Data
@Entity
@Table(name = "document")
public class Document {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_document")
    private UUID id;

    private String type;

    private String number;

    @OneToOne
    @JoinColumn(name = "id_person")
    private Person person;
}
