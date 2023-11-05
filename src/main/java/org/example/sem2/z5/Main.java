package org.example.sem2.z5;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //
        Animal[] animals = {
                new HomeCat("Васька", 4),
                new Tiger("Патрич", 6),
                new Dog("Мурка", 7),
                new Dog("Тузик", 5)
        };
        for (Animal element: animals) {
            element.run(100 + new Random().nextInt(20));
            element.swim(100 + new Random().nextInt(10));
        }
    }
}
