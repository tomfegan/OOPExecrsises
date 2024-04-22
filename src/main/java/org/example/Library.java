package org.example;

import java.util.ArrayList;
import java.util.List;

public class Library {
    List<Book> library = new ArrayList<>();
    public List<Book> getLibrary() {
        return library;
    }
    public void addBookToCatalogue(Book book) {
        this.library.add(book);
    }

    public void depositBook(Book book) {
        book.onLoan = false;
    }
    public void withdrawBook(Book book) {
        book.onLoan = true;
    }
    public List<Book> getBooks(List<Book> books) {

        for (Book book : books) {
            if (book.onLoan) {
                depositBook(book);
                books.remove(book);
            }
            books.remove(book);
        }
        return books;
    }

//    public Ebook getEBooks() {
//        // instance of might be useful here
//
//    }
//
//    public GraphicNovel getGraphicNovel() {
//        // instance of might be useful here
//
//    }
//
//    public SheetMusic getSheetMusic() {
//        // instance of might be useful here
//
//    }

}
