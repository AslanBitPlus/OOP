package org.example.sem6;

public class JsonFormatter implements Formatter{

    @Override
    public void format(Book book) {
        System.out.println(book + " - книга отформатирована в формате JSON");
    }
}
