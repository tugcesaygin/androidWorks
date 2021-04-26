package com.example.activitydatatasima;

import java.io.Serializable;

public class persons implements Serializable {  //nesneyi karsiya gondermek icin
    private int tcno;
    private String name;
    private double height;

    public persons(){

    }

    public persons(int tcno, String name, double height) {
        this.tcno = tcno;
        this.height =  height;
        this.name = name;
    }


    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTcno() {
        return tcno;
    }

    public void setTcno(int tcno) {
        this.tcno = tcno;
    }
}
