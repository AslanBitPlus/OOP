package org.example.sem6;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Library implements Seachable{
    List<Book> books;

    public Library(List<Book> books) {
        this.books = books;
    }

    @Override
    public List<Book> findListBookByAutor(String autor) {
        List<Book> newList = new ArrayList<>();
        return books.stream().filter(el-> el.getAutor().equals(autor)).collect(Collectors.toList());
    }
}
