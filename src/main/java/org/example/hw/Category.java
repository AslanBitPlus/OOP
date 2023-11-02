package org.example.hw;

import java.util.ArrayList;
import java.util.Arrays;

public class Category {
    private String name;
    private String[] products;


    public Category(String name, String[] products) {
        this.name = name;
        this.products = products;
    }

    public Category() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getProducts() {
        return products;
    }

    public void setProducts(String[] products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "Категория {'" + name + '\'' +
                ", Товары: " + Arrays.toString(products) +
                '}';
    }
}
