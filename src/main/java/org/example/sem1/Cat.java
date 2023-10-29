package org.example.sem1;

public class Cat extends Animal {
    // По умолчанию модификатор доступа default но его не пишут
    // default String name;
    // private String name; // если с большой буквы то name -> null
    private String color;
    private Integer age; // если с маленькой буквы то age -> 0
    // Конструктор
    public Cat(String name, String color, Integer age) {
        super(name); // Унаследованное поле
        // this.name = nam e; Убрали так как это поле Cat унаследовало от класса Animal
        this.color = color; // Поле класса Cat (его нет в родительском классе)
        this.age = age; // тоже новое поле
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
    /**
    public String getName() {
        return name;
    }
    **/
    /**
    public void setName(String name) {
        this.name = name;
    }
    **/
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

    @Override
    protected void animalinfo() {
        // super.animalinfo();
        System.out.println("Инфо о коте: \n" + toString());
    }

    @Override
    protected void voice() {
        // super.voice();
        System.out.println("Кот издает звук!");
    }

    @Override
    protected void jump() {
        // super.jump();
        System.out.println("Кот прыгает!");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "color='" + color + '\'' +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
