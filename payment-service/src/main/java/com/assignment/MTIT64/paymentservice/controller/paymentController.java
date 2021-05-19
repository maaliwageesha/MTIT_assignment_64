package com.assignment.MTIT64.paymentservice.controller;
import com.assignment.MTIT64.paymentservice.dto.errorResponse;
import com.assignment.MTIT64.paymentservice.dto.paymentRequest;
import com.assignment.MTIT64.paymentservice.dto.paymentResponse;
import com.assignment.MTIT64.paymentservice.dto.response;
import com.assignment.MTIT64.paymentservice.service.paymentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

/**
 * @author IT18194272 M.W Jinadasa
 * This class is for payment controller which accepts api request for payment endpoint
 */
@RestController
@RequestMapping("/payment")
public class paymentController {

    /**
     * Method to find average
     * @param request- Parametre accepts type payment request
     */

    @Autowired
    private paymentServiceImpl paymentService;

    @PostMapping(consumes="application/json",produces="application/json")
    public @ResponseBody response createPayment(@RequestBody paymentRequest request){

        //For request validation checking required data is available
        if(request.getPayType().equals("")||request.getPayDate().equals("")||request.getProductID().equals("") || request.getQuantity().equals("") || request.getAmount()<0)
        {
            //returns type error response
            var paymentResponse = new errorResponse();
            paymentResponse.setMesssage("Please fill all details");
            return paymentResponse;
        }else{

            System.out.println("Payment Details:-"+request);

            //returns type  payment response
            var paymentResponse = new paymentResponse();
            paymentResponse.setOrderId(UUID.randomUUID().toString());
            paymentResponse.setMesssage("Successfully made payment");
            // returns type payment response from payment service implementation class
            return paymentService.createPayment(request);
        }




    }
}
