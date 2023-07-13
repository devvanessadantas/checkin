package com.roses.checkin.person.registration.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Data
@Table(name = "company")
@Entity
public class Company extends Person{

}
