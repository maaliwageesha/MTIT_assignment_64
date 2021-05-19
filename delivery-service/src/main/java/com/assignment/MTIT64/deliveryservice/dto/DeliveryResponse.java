package com.assignment.MTIT64.deliveryservice.dto;

public class DeliveryResponse {

    private String deliveryId;
    private String message;
    private String trackOrderId;

    /**
     * Getter Setter methods for DeliveryResponse
     **/
    public String getDeliveryId() {
        return deliveryId;
    }

    public void setDeliveryId(String deliveryId) {
        this.deliveryId = deliveryId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getTrackOrderId() {
        return trackOrderId;
    }

    public void setTrackOrderId(String trackOrderId) {
        this.trackOrderId = trackOrderId;
    }
}
