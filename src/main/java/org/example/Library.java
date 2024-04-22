package org.example;

import java.util.ArrayList;
import java.util.List;

public class Library {
    List<Book> library = new ArrayList<Book>();

    public void addBookToCatalogue(Book book) {
        this.library.add(book);
    }
    public void depositBook(Book book, int numberOfDepositedBooks) {
        // add to number of copies of book by int argument
        book.setNumberOfBooksInLibrary(book.numberOfBooksInLibrary += numberOfDepositedBooks);
    }
    public void withdrawBook(Book book, int numberOfWithdrawnBooks) {
        // subtract to number of copies of book by int argument
        book.setNumberOfBooksInLibrary(book.numberOfBooksInLibrary -= numberOfWithdrawnBooks);
    }
    public Book getBooks(Book book,
                         int numberOfDepositedBooks,
                         int numberOfWithdrawnBooks) {
        return book.num
    }

    public Ebook getEBooks() {
    // instance of might be useful here

    }

    public GraphicNovel getGraphicNovel() {
    // instance of might be useful here

    }

    public SheetMusic getSheetMusic() {
    // instance of might be useful here

    }

}
