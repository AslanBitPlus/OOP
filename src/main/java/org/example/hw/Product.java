package org.example.hw;

public class Product {
    private String name;
    private Double price;
    private Integer rating;

    public Product(String name, Double price, Integer rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    public Product() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Товары {'" + name + '\'' +
                ", цена: " + price + " руб." +
                ", кол-во: " + rating + " шт." +
                '}';
    }
}
