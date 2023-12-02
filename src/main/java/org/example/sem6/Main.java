package org.example.sem6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //

        BookGenre bookGenre1 = new BookGenre("tt");
        BookGenre bookGenre2 = new BookGenre("pp");
        // Book book1 = new Book("qwe", "asd", 1, 2001);
        // Book book2 = new Book("rty", "fgh", 2, 2002);
        // Book book3 = new Book("qwe", "uio", 3, 2003);
        // Book book4 = new Book("rty", "asd5", 16, 2009);

        // ElectronBook electronBook1 = new ElectronBook("asd", "zxc", 5, 2010, "html", 45.0);
        // ElectronBook electronBook2 = new ElectronBook("qwe", "zxc", 5, 2010, "html", 45.0);

        // List<Book> list1 = new ArrayList<>(Arrays.asList(book1, book2, book3, book4, electronBook1, electronBook2));
        Library library = new Library(Arrays.asList(
                new Book("qwe", "asd", 1, 2001, bookGenre1),
                new Book("rty", "fgh", 2, 2002, bookGenre1),
                new Book("qwe", "uio", 3, 2003, bookGenre2),
                new Book("rty", "asd5", 16, 2009, bookGenre2),
                new ElectronBook("asd", "zxc", 5, 2010, bookGenre1, "html", 45.0),
                new ElectronBook("qwe", "zxc", 5, 2010, bookGenre2,"html", 45.0)));

        System.out.println("library = " + library.findListBookByAutor("qwe"));

        Formatter formatter = new JsonFormatter();
        formatter.format(library.findListBookByAutor("qwe").get(0));
    }
}
