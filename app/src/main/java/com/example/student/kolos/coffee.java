package com.example.student.kolos;

/**
 * Created by student on 2018-01-03.
 */

public class coffee {

    private String name;
    private String price;

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public coffee(String name, String price) {
        this.name = name;
        this.price = price;
    }
}
