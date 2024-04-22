package org.example;

public class SheetMusic extends Book {
    String composer;

    public SheetMusic(String title, int pages, String composer) {
        super(title, pages);
        this.composer = composer;
    }

    public String getComposer() {
        return composer;
    }
}
