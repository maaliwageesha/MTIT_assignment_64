package com.assignment.MTIT_64.refund_Money.Service;

import com.assignment.MTIT_64.refund_Money.dto.FeedbackCreationRequest;
import com.assignment.MTIT_64.refund_Money.dto.FeedbackCreationResponce;
import com.assignment.MTIT_64.refund_Money.dto.refundRequest;
import com.assignment.MTIT_64.refund_Money.dto.refundResponce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.UUID;

@Service
public class refundServiceIml {
    @Autowired
    private RestTemplate restTemplate;

    public refundResponce makingRefund(refundRequest requestrefund){

        var feedbackcreationRequest= new FeedbackCreationRequest();
        feedbackcreationRequest.setCustomerName(requestrefund.getCustomerName());
        feedbackcreationRequest.setServiceRating(requestrefund.getServiceRating());
        feedbackcreationRequest.setFeedBackDescription(requestrefund.getFeedBackDescription());
        feedbackcreationRequest.setIsServicefailure(requestrefund.getIsServicefailure());
        feedbackcreationRequest.setOrderId(requestrefund.getOrderId());

       ResponseEntity<FeedbackCreationResponce>feedbackCreationResponseEntity = restTemplate.postForEntity("http://localhost:8080/feedback",feedbackcreationRequest,FeedbackCreationResponce.class);



        var responce =new refundResponce();
        refundRequest refundRequest = new refundRequest();
//        refundRequest.setOrderId(UUID.randomUUID().toString());
//        refundRequest.setPaymentId(UUID.randomUUID().toString());
//        refundRequest.setProductID(UUID.randomUUID().toString());
        responce.setRefundId(UUID.randomUUID().toString());
        responce.setFeedbackId(feedbackCreationResponseEntity.getBody().getFeedbackId());
        responce.setMessage("refund working");
        return responce;

    }

    @Bean
    private RestTemplate restTemplate(RestTemplateBuilder restTemplateBuilder){
        return restTemplateBuilder.build();
    }

}
