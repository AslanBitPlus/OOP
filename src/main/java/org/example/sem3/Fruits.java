package org.example.sem3;

public enum Fruits {
    APPLE("Яблоко"),
    PEAR("Груша"),
    BANANA("Банан"),
    ORANGE("Апельсин");

    private String name;

    Fruits(String name) {
        this.name = name;
    }


    Fruits() {
    }

    public String getName() {
        return name;
    }

}
