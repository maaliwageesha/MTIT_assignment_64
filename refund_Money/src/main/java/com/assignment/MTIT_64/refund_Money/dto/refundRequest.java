package com.assignment.MTIT_64.refund_Money.dto;
/**

author: M.D.N.K.Wijewardena
 */

import java.util.Date;

public class refundRequest {

    private String customerName;
    private String productName;
    private String productID;
    private int quantity;
    private double amount;
    private String refundReason;
    private String isServicefailure;
    private Date refundDate;
    private String serviceRating;
    private String feedBackDescription;
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

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getRefundReason() {
        return refundReason;
    }

    public void setRefundReason(String refundReason) {
        this.refundReason = refundReason;
    }

    public String getIsServicefailure() {
        return isServicefailure;
    }

    public void setIsServicefailure(String isServicefailure) {
        this.isServicefailure = isServicefailure;
    }

    public Date getRefundDate() {
        return refundDate;
    }

    public void setRefundDate(Date refundDate) {
        this.refundDate = refundDate;
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

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }


    @Override
    public String toString() {
        return "refundRequest{" +
                "customerName='" + customerName + '\'' +
                ", productName='" + productName + '\'' +
                ", productID='" + productID + '\'' +
                ", quantity=" + quantity +
                ", amount=" + amount +
                ", refundReason='" + refundReason + '\'' +
                ", isServicefailure='" + isServicefailure + '\'' +
                ", refundDate=" + refundDate +
                ", serviceRating='" + serviceRating + '\'' +
                ", feedBackDescription='" + feedBackDescription + '\'' +
                ", orderId='" + orderId + '\'' +
                '}';
    }
}
