package com.assignment.MTIT64.deliveryservice.service;

import com.assignment.MTIT64.deliveryservice.dto.DeliveryRequest;
import com.assignment.MTIT64.deliveryservice.dto.DeliveryResponse;
import com.assignment.MTIT64.deliveryservice.dto.TrackOrderCreationRequest;
import com.assignment.MTIT64.deliveryservice.dto.TrackOrderCreationResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.UUID;

@Service
public class DeliveryServiceImpl {

    @Autowired
    private RestTemplate restTemplate;

    /**
     * Create Delivery Response
     * @param deliveryRequest The Delivery request
     * @return the delivery response
     */

//    creating a createDelivery method
    public DeliveryResponse createDelivery(DeliveryRequest deliveryRequest){

        // api request
        var trackOrderCreationRequest = new TrackOrderCreationRequest();
        trackOrderCreationRequest.setBillId(deliveryRequest.getReciptId());
        trackOrderCreationRequest.setExpectedDate(deliveryRequest.getDeliveryDate());
        ResponseEntity<TrackOrderCreationResponse> trackOrderCreationResponse= restTemplate.postForEntity("http://localhost:8093/trackOrders",trackOrderCreationRequest, TrackOrderCreationResponse.class);

        var deliveryResponse = new DeliveryResponse();
        //crete unique identifier and returning as delivery Id
        deliveryResponse.setDeliveryId(UUID.randomUUID().toString());
        deliveryResponse.setTrackOrderId(trackOrderCreationResponse.getBody().getTrackOrderId());
        //Setting the message to success
        deliveryResponse.setMessage("Delivery Success");

        return deliveryResponse;

    }
    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder){
        return builder.build();
    }
}
