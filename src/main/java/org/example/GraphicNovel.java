package org.example;

public class GraphicNovel extends Book {
    String illustrator;

    public GraphicNovel(String title, int pages, int numberOfBooksInLibrary, String illustrator) {
        super(title, pages, numberOfBooksInLibrary);
        this.illustrator = illustrator;
    }

    public String getIllustrator() {
        return illustrator;
    }

}
