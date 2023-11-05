package org.example.sem2;

public abstract class Animal {

    protected String name;

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    public abstract void animalInfo(); // Когда прописываем abstract
    // появляется значок слева (зеленый) интерфейсный метод.
    // Необходимо удалить тело метода. Переводим и класс Animal тоже
    // в abstract

    public void voice() {
        System.out.println("Звук!");
    }

    public void jump() {
        System.out.println(" Прыжок ! ");
    }
}
