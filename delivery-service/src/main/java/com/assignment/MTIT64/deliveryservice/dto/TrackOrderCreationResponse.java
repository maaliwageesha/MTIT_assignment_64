package com.assignment.MTIT64.deliveryservice.dto;

public class TrackOrderCreationResponse {
    private String trackOrderId;
    private String message;

    /**
     * Getter Setter methods for TrackOrderCreationResponse
     **/

    public String getTrackOrderId() {
        return trackOrderId;
    }

    public void setTrackOrderId(String trackOrderId) {
        this.trackOrderId = trackOrderId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
