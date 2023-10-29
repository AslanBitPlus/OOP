package org.example.sem1;

public class Animal {
    protected String name;


    public Animal(String name) {
        this.name = name;
    }

    public Animal() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

   // Метод
   protected void animalinfo() {
       System.out.println("Имя животного " + name);
   }

    protected void voice() {
        System.out.println("Животное издает звук!");
    }

    protected void jump() {
        System.out.println("Животное прыгает!");
    }



    // Метод toString
    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }
}
