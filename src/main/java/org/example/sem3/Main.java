package org.example.sem3;

import java.time.Month;

public class Main {
    public static void main(String[] args) {
        //
        for (Fruits value : Fruits.values()) { // Fruits.values.iter ...
            System.out.println(value);
        }

        Fruits fruits = Fruits.PEAR;
        switch (fruits) {
            case APPLE -> System.out.println(fruits + " - Этот фрукт - " + fruits.getName());
            case PEAR -> System.out.println(fruits + " - Этот фрукт - " + fruits.getName());
            case BANANA -> System.out.println(fruits + " - Этот фрукт - " + fruits.getName());
            case ORANGE -> System.out.println(fruits + " - Этот фрукт - " + fruits.getName());
            default -> System.out.println(fruits + " - Это неопознанный фрукт!");
        }
    }
}
