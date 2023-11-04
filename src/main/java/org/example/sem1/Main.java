package org.example.sem1;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    private final Integer COUNT_CROCODILE = 2;
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

        // Создаем родительский класс для класса  Cat
        Animal animal1 = new Animal();
        System.out.println(cat1);
        Animal animal2 = new Animal("Конь");
        animal2.animalinfo();
        animal2.voice();
        animal2.jump();
        cat1.animalinfo();
        cat1.voice();
        cat1.jump();

        // Создаем класс Vector. и метод определения длины вектора
        // и скалярного произведения
        Vector vector1 = new Vector(1, 1, 5);
        Vector vector2 = new Vector(0, 5, 2);
        System.out.println("vector1 = " + vector1);
        System.out.println("vector2 = " + vector2);

        System.out.println("Длина вектора 1 = " + vector1.lengthVector());
        System.out.println("Длина вектора 2 = " + vector2.lengthVector());

        System.out.println("Скалярное произведение вектора1 на вектор2 = " + vector1.scolar(vector2));

        System.out.println("Векторное произведение вектора1 на вектор2 = " + vector1.multivector(vector2));

        System.out.println("Косинус угла между вектором1 и вектором2 = " + vector1.cosanglebetvectors(vector2));

    }

}

// ==========================
// Просмотрел до 51 минуты
// ==========================