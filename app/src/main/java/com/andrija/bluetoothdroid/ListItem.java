package com.andrija.bluetoothdroid;

public class ListItem {

    private int pin;
    private String type;
    private int pwm;

    public ListItem(int pin, String type) {
        this.pin = pin;
        this.type = type;
    }

    public ListItem(int pin, int pwm, String type){
        this.pin = pin;
        this.pwm = pwm;
        this.type = type;
    }

    public int getPin() {
        return pin;
    }

    String getType() {
        return type;
    }

    int getPwm() {
        return pwm;
    }

    void setPwm(int pwm) {
        this.pwm = pwm;
    }
}
