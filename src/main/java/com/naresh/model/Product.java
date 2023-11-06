package com.naresh.model;

public class Product {


    private static int id ;
    private static String title;
    private static String image;
    private static int price;

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Product.id = id;
    }

    public static String getTitle() {
        return title;
    }

    public static void setTitle(String title) {
        Product.title = title;
    }

    public static String getImage() {
        return image;
    }

    public static void setImage(String image) {
        Product.image = image;
    }

    public static int getPrice() {
        return price;
    }

    public static void setPrice(int price) {
        Product.price = price;
    }


}
