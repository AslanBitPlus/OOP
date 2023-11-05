package org.example.sem2.z5;

public class Cat extends Animal{
    public Cat(String name, Integer age) {
        super(name, age, 200, 0);
    }

    @Override
    protected void swim(int distance) {
        System.out.println("Коты не умеют плавать!");

    }
}
