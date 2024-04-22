package org.example;

public class Ebook extends Book {
    enum fileType {
        TXT,
        JPEG,
        PDF,
        EXE
    };

    public Ebook(String title, int pages, int numberOfBooksInLibrary) {
        super(title, pages, numberOfBooksInLibrary);
    }


}
