package org.example;

public class SheetMusic extends Book {
    String composer;

    public SheetMusic(String title, int pages, int numberOfBooksInLibrary, String composer) {
        super(title, pages, numberOfBooksInLibrary);
        this.composer = composer;
    }

    public String getComposer() {
        return composer;
    }
}
