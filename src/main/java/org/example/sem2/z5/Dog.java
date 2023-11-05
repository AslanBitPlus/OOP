package org.example.sem2.z5;

public class Dog extends Animal{
    public Dog(String name, Integer age) {
        super(name, age, 500, 10);
    }

    @Override
    protected void swim(int distance) {
        if (distance < maxRunDistance) {
            System.out.println(name + " проплыл " + distance + " метров");
        } else {
            System.out.println(name + " НЕ проплыл " + distance + " метров");
        }

    }
}
