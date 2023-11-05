package org.example.sem2;

public class Main {

    private final Integer COUNT = 12; // Имя пишется заглавными буквами

    public static void main(String[] args) {
        Cat cat = new Cat("qwe", "asd", 21);
        //па полям
//        cat.name = "Тиша";
//        cat.color = "Black";
//        cat.age = 21;
        //инкапсулировали
        cat.setName("Тиша");
        cat.setColor("Black");
        cat.setAge(31);
        System.out.println("cat = " + cat);
        cat.jump();
        cat.voice();
        cat.animalInfo();

        qwe();  // Нажав на Alt+Enter, создается static метод
                // Static метод вызывается из static метода
                // со static методом не используются this и super
        // final могут быть поля, методы и классы
        // private final Integer COUNT = 123; // Имя пишется заглавными буквами
        System.out.println(Math.PI); // Поле final
        // final метод нельзя override - ить
        // большинство классов в Java финальные. Для того чтобы не
        // мутировали (защита от дураков!!!) Классы от разработчика языка
        // Просмотреть эти классы можно навести курсор на класс и нажать CTRL+H

        Animal animal = new Animal() {
            @Override
            public void animalInfo() {

            }
        };
        System.out.println(animal.getClass().getName());

        Animal dog = new Dog();
        System.out.println(dog.getClass().getName());
    }

    private static void qwe() {
        System.out.println("qwe");
    }

}