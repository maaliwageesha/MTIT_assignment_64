package com.assignment.MTIT64.customerservice.controller;

import com.assignment.MTIT64.customerservice.dto.CustomerRequest;
import com.assignment.MTIT64.customerservice.dto.CustomerResponse;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @PostMapping(consumes = "application/json", produces = "application/json")
    public @ResponseBody CustomerResponse CreateCustomer(@RequestBody CustomerRequest customerRequest){

        System.out.println("User Details  : " + customerRequest);
        var customerResponse = new CustomerResponse();
        customerResponse.setUserId(UUID.randomUUID().toString());
        customerResponse.setMessage("Successfully Created Customer ");

        return customerResponse;
    }
}
