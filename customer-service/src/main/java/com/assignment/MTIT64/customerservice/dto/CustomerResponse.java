package com.assignment.MTIT64.customerservice.dto;

public class CustomerResponse    {

    private String UserId,Message;

    public String getUserId() {
        return UserId;
    }

    public String getMessage() {
        return Message;
    }

    public void setUserId(String userId) {
        UserId = userId;
    }

    public void setMessage(String message) {
        Message = message;
    }
}
