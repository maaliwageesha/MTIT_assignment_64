package com.assignment.MTIT64.wishlistservice.dto;

public class WishListResponse {

    private String productId, customerId, Message, WishListID;

    public String getProductId() {
        return productId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getMessage() {
        return Message;
    }

    public String getWishListID() {
        return WishListID;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public void setMessage(String message) {
        Message = message;
    }

    public void setWishListID(String wishListID) {
        WishListID = wishListID;
    }
}
