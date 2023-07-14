package com.roses.checkin.person.registration.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Table(name = "company")
@Entity
public class Company extends Person{

}
