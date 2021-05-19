package com.assignment.MTIT64.paymentservice.dto;


/**
 * @author IT18194272 M.W Jinadasa
 * This class is for error response model
 */
public class errorResponse implements response {

    private String messsage;

    public String getMesssage() {
        return messsage;
    }

    public void setMesssage(String messsage) {
        this.messsage = messsage;
    }


}
