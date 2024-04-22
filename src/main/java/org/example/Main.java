package org.example;

import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        String str = "Hello World!";
        System.out.println(str);

        Book book1 = new Book("LOTR", 10, 4);
        System.out.println("Current page number = " + book1.currentPage);
        System.out.println("Title = " + book1.title);

        int randomNumberOfPagesToTurn = ThreadLocalRandom.current().nextInt();
        System.out.println(book1.turnPage(randomNumberOfPagesToTurn));

        System.out.println("Title = " + book1.title);

        Ebook javaEbook1 = new Ebook("Java eBook", 1000, 2);
        GraphicNovel graphicNovel1 = new GraphicNovel("V for Vendetta", 500, 3, "Alan Moore");
        SheetMusic sheetMusic1 = new SheetMusic("The Mass in B Minor", 200, 7, "Johann Sebastian Bach");

        Library newList = new Library();
        newList.addBookToCatalogue(book1);
        newList.addBookToCatalogue(javaEbook1);
        newList.addBookToCatalogue(graphicNovel1);
        newList.addBookToCatalogue(sheetMusic1);

        for (Book book : newList.library) {
            System.out.println(book.getTitle());
            System.out.println(book.numberOfBooksInLibrary);

        }
        newList.depositBook(book1, 3);
        newList.withdrawBook(sheetMusic1, 1);

        for (Book book : newList.library) {
            System.out.println(book.getTitle());
            System.out.println(book.numberOfBooksInLibrary);
        }







//        newList.add(javaEbook1);
//        newList.add(graphicNovel1);
//        newList.add(sheetMusic1);
//
//        Library library1 = new Library(newList);




    }
}