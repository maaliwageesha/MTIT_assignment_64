package com.assignment.MTIT64.wishlistservice.dto;

public class ProductCreationResponse {

    private String message, productId;

    public void setMessage(String message) {
        this.message = message;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getMessage() {
        return message;
    }

    public String getProductId() {
        return productId;
    }

}
