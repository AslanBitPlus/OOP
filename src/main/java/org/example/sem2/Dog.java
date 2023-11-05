package org.example.sem2;

import org.example.sem2.Animal;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);

    } // Наводим на Dog и Alt+Enter. И исправляем
    // ошибку. Для того чтобы override - ть метод animalInfo

    @Override
    public void animalInfo() {
        System.out.println("Это собака с именем: " + name);

    }

    @Override
    public void voice() {

    }
}
