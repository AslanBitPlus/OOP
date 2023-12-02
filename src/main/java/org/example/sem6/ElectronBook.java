package org.example.sem6;

public class ElectronBook extends Book{
    private String formatRead;
    private Double sizeBook;


    public ElectronBook(String autor, String name, Integer countList, Integer year, BookGenre bookGenre, String formatRead, Double sizeBook) {
        super(autor, name, countList, year, bookGenre);
        this.formatRead = formatRead;
        this.sizeBook = sizeBook;
    }

    @Override
    public String toString() {
        return "ElectronBook{" +
                "formatRead='" + formatRead + '\'' +
                ", sizeBook=" + sizeBook +
                '}';
    }
}
