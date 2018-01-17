package com.lentimosystems.bodapp.Model;

/**
 * Created by LICIO on 1/15/2018.
 */

public class Sender {
    public Data data;
    public String to;

    public Sender() {
    }

    public Sender(Data data, String to) {
        this.data = data;
        this.to = to;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }
}