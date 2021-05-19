package com.assignment.MTIT64.productsservice.controller;

import com.assignment.MTIT64.productsservice.dto.ProductRequest;
import com.assignment.MTIT64.productsservice.dto.ProductResponse;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("products")
public class ProductController {

    @PostMapping(consumes = "application/json", produces = "application/json")
    public @ResponseBody ProductResponse CreateProduct(@RequestBody ProductRequest productRequest){

        System.out.println("The Created Product is : " + productRequest);

        var productResponse = new ProductResponse();
        productResponse.setProductId(UUID.randomUUID().toString());
        productResponse.setMessage("The Product has been created Successfully");
        return productResponse;
    }
}
