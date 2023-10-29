package org.example;

public class Cat {
    // По умолчанию модификатор доступа default но его не пишут
    // default String name;
    private String name; // если с большой буквы то name -> null
    private String color;
    private Integer age; // если с маленькой буквы то age -> 0
    // Конструктор
    public Cat(String name, String color, Integer age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }
    // default - ный конструктор
    // Если нет стандартного конструктора, по умолчанию он есть. Его не нужно создавать
    // Но при создании стандартного конструктора
    // Cat cat1 = new Cat(); - не будет работать, если мы не пропишем и default-ный
    // rjycnhernjh
    public Cat() {

    }


    // для вставки методов Set и Get
    // Курсор наводим на имя класса Cat и нажимаем на Alt + insert
    // В появившемся меню выбираем Getter and Setter
    // Далее выбираем поле и нажимаем Ok
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        if (age > 0 && age < 15) {
            this.age = age;
        }
        else {
            System.out.println("Введен некорректный возраст");
        }
    }
}
