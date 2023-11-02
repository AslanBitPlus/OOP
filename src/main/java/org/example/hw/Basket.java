package org.example.hw;

import java.util.Arrays;

public class Basket {
    private String[] products;

    public Basket() {
    }

    public String[] getProducts() {
        return products;
    }

    public void setProducts(String[] products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "Корзина{" +
                "Товары: " + Arrays.toString(products) +
                '}';
    }
}
