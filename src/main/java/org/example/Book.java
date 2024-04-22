package org.example;

public class Book {
    String title;
    int pages;
    int currentPage;

    boolean onLoan = false;

    public Book(String title, int pages) {
        this.title = title;
        this.pages = pages;
        currentPage = 1;
    }

    public int turnPage(int numberOfPagesTurned) {
        if (this.pages >= this.currentPage) {
            return currentPage = currentPage + numberOfPagesTurned;
        }
        return currentPage;
    }

    public String getTitle() {
        return title;
    }

    public int getPages() {
        return pages;
    }

    public int getCurrentPage() {
        return currentPage;
    }


}
