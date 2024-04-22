package org.example;

import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        String str = "Hello World!";
        System.out.println(str);

        Book book1 = new Book("LOTR", 10);
        System.out.println("Current page number = " + book1.currentPage);
        System.out.println("Title = " + book1.title);

        int randomNumberOfPagesToTurn = ThreadLocalRandom.current().nextInt();
        System.out.println(book1.turnPage(randomNumberOfPagesToTurn));

        System.out.println("Title = " + book1.title);

        Ebook javaEbook1 = new Ebook("Java eBook", 1000);
        GraphicNovel graphicNovel1 = new GraphicNovel("V for Vendetta", 500, "Alan Moore");
        SheetMusic sheetMusic1 = new SheetMusic("The Mass in B Minor", 200, "Johann Sebastian Bach");

        Library libraryBookList1 = new Library();
        libraryBookList1.addBookToCatalogue(book1); // why no "book" prompt by IntelliJ? Cf ln 25-26 below
        libraryBookList1.addBookToCatalogue(javaEbook1); // why no "book" prompt by IntelliJ? Cf ln 25-26 below
        libraryBookList1.addBookToCatalogue(graphicNovel1);
        libraryBookList1.addBookToCatalogue(sheetMusic1);

        for (Book book : libraryBookList1.getLibrary()) {
            System.out.println(book.getTitle());
        }
        libraryBookList1.depositBook(book1);
        libraryBookList1.withdrawBook(sheetMusic1);

        for (Book book : libraryBookList1.getLibrary()) {
            System.out.println(book.getTitle() + " " + book.onLoan);
        }

        libraryBookList1.getBooks(libraryBookList1.getLibrary());


        for (Book book : libraryBookList1.getLibrary()) {
            System.out.println(book.getTitle());
        }


//        libraryBookList1.add(javaEbook1);
//        libraryBookList1.add(graphicNovel1);
//        libraryBookList1.add(sheetMusic1);
//
//        Library library1 = new Library(libraryBookList1);


    }
}