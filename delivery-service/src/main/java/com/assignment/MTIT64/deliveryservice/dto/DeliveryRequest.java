package com.assignment.MTIT64.deliveryservice.dto;

public class DeliveryRequest {
    private String recipentName;
    private String deliveryAddress;
    private String deliveryDate;
    private String deliveryTime;
    private String productList;
    private String reciptId;
    private String deliveryType;

    /**
     * Getter Setter methods for DeliveryRequest
     **/

    public void setRecipentName(String recipentName) {
        this.recipentName = recipentName;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public String getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(String deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public String getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(String deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public String getProductList() {
        return productList;
    }

    public void setProductList(String productList) {
        this.productList = productList;
    }

    public String getReciptId() {
        return reciptId;
    }

    public void setReciptId(String reciptId) {
        this.reciptId = reciptId;
    }

    public String getDeliveryType() {
        return deliveryType;
    }

    public void setDeliveryType(String deliveryType) {
        this.deliveryType = deliveryType;
    }

    /**
     * Generating string
     **/
    @Override
    public String toString() {
        return "DeliveryRequest{" +
                "recipentName='" + recipentName + '\'' +
                ", deliveryAddress='" + deliveryAddress + '\'' +
                ", deliveryDate='" + deliveryDate + '\'' +
                ", deliveryTime='" + deliveryTime + '\'' +
                ", productList='" + productList + '\'' +
                ", reciptId='" + reciptId + '\'' +
                ", deliveryType='" + deliveryType + '\'' +
                '}';
    }
}
