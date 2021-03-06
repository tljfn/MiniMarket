package com.balinasoft.mallione.networking.Request;

/**
 * Created by hzkto on 10/21/2016.
 */

public class RequestConfirmPayment {
    private String session_id;

    private String user_id;

    private String order_id;

    public RequestConfirmPayment(String session_id, String user_id, String order_id) {
        this.session_id = session_id;
        this.user_id = user_id;
        this.order_id = order_id;
    }

    public String getOrder_id() {
        return order_id;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }

    public String getSession_id() {
        return session_id;
    }

    public void setSession_id(String session_id) {
        this.session_id = session_id;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }
}
