package com.assignment.MTIT_64.refund_Money.dto;

/**

 author: M.D.N.K.Wijewardena
 */
public class refundResponce {

    private String refundId;
    private String feedbackId;
    private String message;



    /**
     * generate getters and setters
     * @return
     */
    public String getRefundId() {
        return refundId;
    }

    public void setRefundId(String refundId) {
        this.refundId = refundId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getFeedbackId() {
        return feedbackId;
    }

    public void setFeedbackId(String feedbackId) {
        this.feedbackId = feedbackId;
    }
}
