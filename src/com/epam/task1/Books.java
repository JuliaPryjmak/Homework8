package com.epam.task1;

import java.util.Scanner;

public class Books {
    private static Book[] massive = new Book[5];
    private static int count = 0;
    private Book book;

    public static Book[] getMassive() {
        return massive;
    }


    public void setBook(Book book) {
        this.book = book;
    }


    static Book addBook(int id, String nameBook, String authorBook, String publishingOffice, int yearOfPublishing, int numberOfPages, int price) {
        return massive[count++] = new Book(id, nameBook, authorBook, publishingOffice, yearOfPublishing, numberOfPages, price);
    }

    static void printBooks() {
        System.out.println("Ваши книги: ");
        for (int i = 0; i < count; i++) {
            Book x = massive[i];
            x.view();

        }
    }

    static Book[] reduceByPercent(Book[] massive) {
        System.out.println("Введите процент: ");
        Scanner sc = new Scanner(System.in);
        int percent = sc.nextInt();
        for (int i = 0; i < count; i++) {
            Book x = massive[i];
            int price = x.getPrice();
            int newPercent = (int) (0.01 * percent * price);
            x.setPrice(price - newPercent);
        }
        return massive;
    }

    static Book[] searchBookByAuthor(Book[] massive) {
        System.out.println("Введите автора: ");
        Scanner sc = new Scanner(System.in);
        String wordAuthor = sc.nextLine();
        for (int i = 0; i < count; i++) {
            Book x = massive[i];
            String author = x.getAuthorBook();
            if (author.equals(wordAuthor)) {
                x.view();
            }
        }
        return massive;
    }

    static Book[] searchBookByYear(Book[] massive) {
        System.out.println("Введите год: ");
        Scanner sc = new Scanner(System.in);
        int newYear = sc.nextInt();
        for (int i = 0; i < count; i++) {
            Book x = massive[i];
            int yearOfPublishing = x.getYearOfPublishing();
            if (newYear < yearOfPublishing) {
                x.view();
            }
        }
        return massive;
    }


}
