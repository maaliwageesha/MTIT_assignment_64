package com.assignment.MTIT64.orderservice.controller;

import com.assignment.MTIT64.orderservice.dto.orderRequest;
import com.assignment.MTIT64.orderservice.dto.orderResponse;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

/**
 * @author IT18194272 M.W Jinadasa
 * This class is for order controller which accepts api request
 */
@RestController
@RequestMapping("/order")


public class orderController {

    /**
     * Method to find average
     * @param request- Parametre accepts type order request
     */

    @PostMapping(consumes="application/json",produces="application/json")
    //This is the response body for the order which return json output of type order response
    public @ResponseBody
    orderResponse createOrder(@RequestBody orderRequest request){

        System.out.println("Payment Details"+request);

        var orderResponse = new orderResponse();
        //Sets order details
        orderResponse.setOrderId(UUID.randomUUID().toString());
        orderResponse.setMesssage("Successfully made order");

        return orderResponse;
    }
}
