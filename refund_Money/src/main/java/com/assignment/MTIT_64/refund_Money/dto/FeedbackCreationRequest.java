package com.assignment.MTIT_64.refund_Money.dto;
/**

 author: M.D.N.K.Wijewardena
 */

public class FeedbackCreationRequest {

    private String customerName;
    private String serviceRating;
    private String feedBackDescription;
    private String isServicefailure;
    private String orderId;


    /**
     * generate getters and setters
     * @return
     */

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getServiceRating() {
        return serviceRating;
    }

    public void setServiceRating(String serviceRating) {
        this.serviceRating = serviceRating;
    }

    public String getFeedBackDescription() {
        return feedBackDescription;
    }

    public void setFeedBackDescription(String feedBackDescription) {
        this.feedBackDescription = feedBackDescription;
    }

    public String getIsServicefailure() {
        return isServicefailure;
    }

    public void setIsServicefailure(String isServicefailure) {
        this.isServicefailure = isServicefailure;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
}
