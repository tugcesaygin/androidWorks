package com.example.datatasima;

import java.io.Serializable;

public class Persons implements Serializable {


    private int tcno;
    private String name ;
    private double height ;


    public Persons(){

    }


    public Persons(int tcno, String name , double height){

        this.tcno = tcno;
        this.name = name;
        this.height = height;

    }

    public int getTcno() {
        return tcno;
    }

    public void setTcno(int tcno) {
        this.tcno = tcno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
