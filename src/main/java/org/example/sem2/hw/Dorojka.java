package org.example.sem2.hw;

public class Dorojka extends Prepyat{

    public Dorojka(String name, Integer dist) {
        super(name, dist);
    }

    @Override
    public String toString() {
        return "Дорожка{" +
                "Имя: '" + name + '\'' +
                ", длина: " + dist +
                '}';
    }
}
