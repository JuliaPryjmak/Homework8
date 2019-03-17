package com.epam.task1;

import static com.epam.task1.Books.*;

public class Task1 {
    public static void main(String[] args) {
        Books books = new Books();
        Book book = addBook(1, "Пригоди Ведмедя", "Філюк", "Видавництво АБАГАЛАМА", 1978, 540, 350);
        Book book1 = addBook(2, "Пригоди Ведмедя", "О.Русанов", "Видавництво АБАГАЛАМА", 1987, 540, 350);
        books.setBook(book);
        books.setBook(book1);
        printBooks();
        reduceByPercent(getMassive());
        printBooks();
        searchBookByAuthor(getMassive());
        searchBookByYear(getMassive());
    }
}
