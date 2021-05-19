package com.assignment.MTIT64.wishlistservice.service;

import com.assignment.MTIT64.wishlistservice.dto.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.UUID;

@Service
public class WishListServiceImpl {

    @Autowired
    private RestTemplate restTemplate;

    public WishListResponse CreateWishList(WishListRequest wishListRequest){

        var productCreationRequest = new ProductCreationRequest();
        productCreationRequest.setCategory(wishListRequest.getCategory());
        productCreationRequest.setName(wishListRequest.getProductName());
        productCreationRequest.setQty(wishListRequest.getQty());
        ResponseEntity<ProductCreationResponse> productCreationResponse = restTemplate.postForEntity("http://localhost:8070/products",productCreationRequest, ProductCreationResponse.class);

         var customerCreation = new CustomerCreationRequest();
         customerCreation.setFirstName(wishListRequest.getFirstName());
         customerCreation.setLastName(wishListRequest.getFirstName());
         customerCreation.setAddress(wishListRequest.getAddress());
         customerCreation.setAge(wishListRequest.getAge());
         customerCreation.setMobile(wishListRequest.getMobile());

        ResponseEntity <CustomerCreationResponse> customerCreationResponse = restTemplate.postForEntity("http://localhost:8021/customer", customerCreation, CustomerCreationResponse.class);


        var wishListResponse = new WishListResponse();
        wishListRequest.setCustomerId(customerCreationResponse.getBody().getUserId());
        wishListResponse.setProductId(productCreationResponse.getBody().getProductId());
        wishListResponse.setWishListID(UUID.randomUUID().toString());
        wishListResponse.setMessage("WishList Added Successfully !");

        return  wishListResponse;

    }



    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder){
        return builder.build();
    }
}
