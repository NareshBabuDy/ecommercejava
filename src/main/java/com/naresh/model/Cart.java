package com.naresh.model;

public class Cart {
    private static int id ;
    private static int userid;

    private static int count;
     private Product product;

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Cart.id = id;
    }

    public static int getUserid() {
        return userid;
    }

    public static void setUserid(int userid) {
        Cart.userid = userid;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Cart.count = count;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
    public Cart(int id, int user1d, int count, Product product) {
        this.id = id;
        this.userid = userid;
        this.count = count;
        this.product = product;
    }

}
