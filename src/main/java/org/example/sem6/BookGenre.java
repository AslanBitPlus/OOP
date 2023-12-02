package org.example.sem6;

public class BookGenre implements Genre{
    private String genreName;

    public BookGenre(String genreName) {
        this.genreName = genreName;
    }

    @Override
    public String getGenre(Book book) {
        return genreName;
    }

}
