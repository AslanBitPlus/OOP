package org.example;


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Создать класс Cat с полями: Имя, цвет, кол-во лет
        // Alt + Enter или правой кн.мыши по org.example -> New -> Java Class (указать имя класса) + Enter
        Cat cat1 = new Cat(); // Будет работать, если есть default-ный конструктор
        // cat1.name = "Васька"; // При default -ном поле
        cat1.setName("Васька"); // при private поле
        // cat1.color = "рыжий";
        cat1.setColor("рыжий");
        // cat1.age = 3;
        cat1.setAge(3);
        // Создаем согласно конструктору cat2
        Cat cat2 = new Cat("Мурка", "серый", 2);
        // System.out.println("Кот 1: \n Имя - " + cat1.name
        //         + "\n Цвет- " + cat1.color + "\n Возраст- " + cat1.age);
        System.out.println("Кот 1: \n Имя - " + cat1.getName()
                + "\n Цвет- " + cat1.getColor() + "\n Возраст- " + cat1.getAge());
        // System.out.println(cat1);
        // Оптимизация кода - на меню org.example нажимаем ctrl + Alt + l
        // Ставим галочки на Optimize... и Cleanup... и нажимаем на run
        System.out.println("Кот 2: \n Имя - " + cat2.getName()
                + "\n Цвет- " + cat2.getColor() + "\n Возраст- " + cat2.getAge());

        Vector vector1 = new Vector(1, 1, 5);
        Vector vector2 = new Vector(1, 5, 2);
        System.out.println("vector1 = " + vector1);
        System.out.println("vector2 = " + vector2);


    }

}

// ==========================
// Просмотрел до 51 минуты
// ==========================