package IteratorDesignPattern;

import java.util.Arrays;
import java.util.List;

import IteratorDesignPattern.Books.Book;
import IteratorDesignPattern.LibraryIteration.*;;

public class Client {
    public static void main(String[] args) {
        List<Book> booksList = Arrays.asList(new Book(100, "Science"),
                new Book(200, "History"),
                new Book(300, "Maths"),
                new Book(500, "Physics"));

        Library lib = new Library(booksList);
        IteratorDesignPattern.BookIteration.Iterator iterator = lib.createIterator();

        while (iterator.hasNext()) {
            Book book = (Book) iterator.next();
            System.out.println(book.getBookName());
        }
    }
}
