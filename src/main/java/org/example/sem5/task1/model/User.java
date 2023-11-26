package org.example.sem5.task1.model;

public abstract class User {
    //
    private String name;
    private String secondName;
    private Integer year;


    public User(String name, String secondName, Integer year) {
        this.name = name;
        this.secondName = secondName;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Имя - '" + name + '\'' +
                ", Фамилия - '" + secondName + '\'' +
                ", год - " + year;
    }
}
