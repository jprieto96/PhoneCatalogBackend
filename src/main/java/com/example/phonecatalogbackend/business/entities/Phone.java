package com.example.phonecatalogbackend.business.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Phone {

    @Id
    @GeneratedValue
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

    public Phone() {}
    public Phone(int id, String name, String manufacturer, String description, String color, double price,
                 String imageFileName, String screen, String processor, int ram) {
        this.id = id;
        this.name = name;
        this.manufacturer = manufacturer;
        this .description = description;
        this.color = color;
        this.price = price;
        this.imageFileName = imageFileName;
        this.screen = screen;
        this.processor = processor;
        this.ram = ram;
    }

    public Phone toTransfer() {
        return new Phone(id, name, manufacturer, description, color, price, imageFileName, screen, processor, ram);
    }

}
