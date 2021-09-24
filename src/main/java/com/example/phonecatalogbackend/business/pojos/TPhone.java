package com.example.phonecatalogbackend.business.pojos;

public class TPhone {

    private String name;
    private String manufacturer;
    private String description;
    private String color;
    private double price;
    private String imageFileName;
    private String screen;
    private String processor;
    private int ram;


    public TPhone() {}

    public TPhone(String name, String manufacturer, String description, String color, double price,
                 String imageFileName, String screen, String processor, int ram) {
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

    public String getName() {
        return name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getDescription() {
        return description;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }

    public String getImageFileName() {
        return imageFileName;
    }

    public String getScreen() {
        return screen;
    }

    public String getProcessor() {
        return processor;
    }

    public int getRam() {
        return ram;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setImageFileName(String imageFileName) {
        this.imageFileName = imageFileName;
    }

    public void setScreen(String screen) {
        this.screen = screen;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }
}
