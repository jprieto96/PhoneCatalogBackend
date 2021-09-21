package com.example.phonecatalogbackend.business.phone;

import com.example.phonecatalogbackend.business.entities.Phone;

public class TPhone {

    private int id;
    private String name;
    private String manufacturer;
    private String description;
    private String color;
    private double price;
    private String imageFileName;
    private String screen;
    private String processor;
    private int ram;

    public Phone toEntity() {
        return new Phone(id, name, manufacturer, description, color, price, imageFileName, screen, processor, ram);
    }

}
