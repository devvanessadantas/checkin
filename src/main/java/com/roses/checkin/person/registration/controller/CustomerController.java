package com.roses.checkin.person.registration.controller;

import com.roses.checkin.person.registration.model.Customer;
import com.roses.checkin.person.registration.model.dto.CustomerRequestDto;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @GetMapping
    public void getCustomer(){
    }

    @PostMapping(value = "/insert", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public void insertCustomer(@RequestBody CustomerRequestDto customerRequestDto){
        System.out.println("teste insert method");
    }


}
