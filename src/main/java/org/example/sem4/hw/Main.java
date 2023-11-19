package org.example.sem4.hw;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Calculator calc1 = new Calculator();
        // Сложение элементов массива
        System.out.println("Сложение элементов массива");
        System.out.println(calc1.sum(Arrays.asList(1, 2, 3, 4, 5)));
        System.out.println(calc1.sum(Arrays.asList(1.9, 2, 4, 3.6, 4.2, 5.4)));
        // Умножение элементов массива
        System.out.println("Умножение элементов массива");
        System.out.println(calc1.multip(Arrays.asList(1, 2, 3, 4, 5)));
        System.out.println(calc1.multip(Arrays.asList(1.9, 2, 4, 3.6, 4.2, 5.4)));
        // Деление элементов массива
        System.out.println("Деление элементов массива");
        System.out.println(calc1.div(Arrays.asList(1, 2, 3, 4, 5)));
        System.out.println(calc1.div(Arrays.asList(1.9, 2, 4, 3.6, 4.2, 5.4)));
        // Перевод элементов массива в bin
        System.out.println("Перевод элементов массива в bin");
        calc1.bin(Arrays.asList(123, 204, 31, 47, 52));

    }
}
