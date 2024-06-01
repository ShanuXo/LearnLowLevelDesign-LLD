package IteratorDesignPattern.LibraryIteration;

import IteratorDesignPattern.BookIteration.Iterator;

public interface Aggregate {
    Iterator createIterator();
}
