package com.assignment.MTIT_64.CustomerFeedback.controller;

import com.assignment.MTIT_64.CustomerFeedback.dto.feedbackRequest;
import com.assignment.MTIT_64.CustomerFeedback.dto.feedbackResponce;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/feedback")
public class feedbackController {

    @PostMapping(consumes = "application/json",produces = "application/json")
    public @ResponseBody
    feedbackResponce creatFeedback (@RequestBody feedbackRequest request){

        System.out.println("Feedback Massage:"+request);
        var customerfeedback= new feedbackResponce();
        customerfeedback.setFeedbackId(UUID.randomUUID().toString());
        customerfeedback.setMassage("Thank your Feed Back!");
        return customerfeedback;
    }
}
