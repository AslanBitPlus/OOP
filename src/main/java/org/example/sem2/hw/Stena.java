package org.example.sem2.hw;

public class Stena extends Prepyat{

    public Stena(String name, Integer dist) {
        super(name, dist);
    }

    @Override
    public String toString() {
        return "Стена{" +
                "Имя: '" + name + '\'' +
                ", высота: " + dist +
                '}';
    }
}
