package org.example.sem6;

import java.util.Date;

public class Book { // Создали класс по принципу -S-
    private String autor;
    private String name;
    private Integer countList;
    private Integer year;
    private BookGenre bookGenre;

    public Book(String autor, String name, Integer countList, Integer year, BookGenre bookGenre) {
        this.autor = autor;
        this.name = name;
        this.countList = countList;
        this.year = year;
        this.bookGenre = bookGenre;
    }

    public String getAutor() {
        return autor;
    }

    @Override
    public String toString() {
        return "Book{" +
                "Автор - '" + autor + '\'' +
                ", Имя - '" + name + '\'' +
                ", Кол-во стр - " + countList +
                ", год -" + year +
                '}';
    }
}
