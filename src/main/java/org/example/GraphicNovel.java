package org.example;

public class GraphicNovel extends Book {
    String illustrator;

    public GraphicNovel(String title, int pages, String illustrator) {
        super(title, pages);
        this.illustrator = illustrator;
    }

    public String getIllustrator() {
        return illustrator;
    }

}
