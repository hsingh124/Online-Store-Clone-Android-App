package com.example.phonestore;

//the phone class used for the phones in our store app
public class Phone {
    private int id;
    private String brand; //the brand of the phone of product e.g. Samsung or Apple
    private String modelName; //the model name of the phone e.g. Galaxy s10
    private String imgName; //the img file name of the models
    private String description; //the descriptions for each phone model
    private int price; //the set price of each model
    private int views; //the number of times the user has viewed the phone

    //initialise the objects in the phone
    public Phone(int id, String brand, String modelName, String imgName, String description, int price){
        this.id = id;
        this.brand = brand;
        this.modelName = modelName;
        this.imgName = imgName;
        this.description = description;
        this.price = price;
    }

    public int getId(){
        return id;
    }
    public String getBrand() {
        return brand;
    }
    public String getModelName(){
        return modelName;
    }
    public String getImageName() { return imgName; }
    public String getDescription() { return description; }
    public int getPrice() { return price; }
    public int getViews() { return views; }

    //increases the view count each time the model is viewed
    public void incrementViews() {
        views = views + 1;
    }
}
