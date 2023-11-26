package org.example.sem5.task1.model;

public class Student extends User{
    private Integer id;

   public Student(String name, String secondName, Integer year, Integer id) {
        super(name, secondName, year);
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "id(" + id +
                ") - {Имя - '" + getName() + '\'' +
                ", Фамилия - '" + getSecondName() + '\'' +
                ", год - " + getYear() + "}";
    }
}
