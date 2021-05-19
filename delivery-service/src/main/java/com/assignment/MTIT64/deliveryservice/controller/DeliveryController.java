package com.assignment.MTIT64.deliveryservice.controller;

import com.assignment.MTIT64.deliveryservice.dto.DeliveryRequest;
import com.assignment.MTIT64.deliveryservice.dto.DeliveryResponse;
import com.assignment.MTIT64.deliveryservice.service.DeliveryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

/**
 * The type Track Delivery Controller
 */
@RestController
@RequestMapping("/delivery")
public class DeliveryController {

    @Autowired
    private DeliveryServiceImpl deliveryService;

    /**
     * create delivery
     *
     * @param
     * @return deliveryResponse
     */

    //post request annotation- consumes and produces a json type of an application body
    @PostMapping(consumes = "application/json", produces = "application/json")

    //method to receive order request
    public @ResponseBody
    DeliveryResponse createDelivery(@RequestBody DeliveryRequest request) {

        System.out.println("Delivery Details: " + request);

        //returning the object created
        return deliveryService.createDelivery(request);

    }

}
