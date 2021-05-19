package com.assignment.MTIT_64.refund_Money.Controller;

/**

 author: M.D.N.K.Wijewardena
 */
import com.assignment.MTIT_64.refund_Money.Service.refundServiceIml;
import com.assignment.MTIT_64.refund_Money.dto.refundRequest;
import com.assignment.MTIT_64.refund_Money.dto.refundResponce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/refund")
public class refundController {

    @Autowired
    private refundServiceIml refundService;

    @PostMapping(consumes = "application/json", produces = "application/json")
    public @ResponseBody
    refundResponce createRefund(@RequestBody refundRequest request) {

        System.out.println("refund Details:" + request);

        return refundService.makingRefund(request);

    }
}
