package IteratorDesignPattern.LibraryIteration;

import java.util.List;
import IteratorDesignPattern.BookIteration.BookIterator;
import IteratorDesignPattern.BookIteration.Iterator;
import IteratorDesignPattern.Books.Book;

public class Library implements Aggregate {
    private List<Book> bookList;

    public Library(List<Book> bookList) {
        this.bookList = bookList;
    }

    public Iterator createIterator() {
        return new BookIterator(bookList);
    }
}
