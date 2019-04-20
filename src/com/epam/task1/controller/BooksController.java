package com.epam.task1.controller;

import com.epam.task1.model.Book;
import com.epam.task1.model.Books;
import com.epam.task1.view.BookView;

import java.util.List;
import java.util.Scanner;

import static com.epam.task1.controller.InputUtility.*;


public class BooksController {

    private Books books;
    private Book model;
    private BookView viewBooks = new BookView();

//  public BooksController(){
//        this.model = new Book();
//        this.books = new Books();
//        this.view = new BookView();
//    }


    public void run() {
        viewBooks.print("Enter size -> ");
        books = new Books(inputInt());
//        Book book1 = new Book(InputUtility.inputInt(), InputUtility.inputLine(),InputUtility.inputLine(),InputUtility.inputLine(),
//                InputUtility.inputInt(), InputUtility.inputInt(),InputUtility.inputInt());
        //  Book book1 = new Book(1,"ter", "erere", "tytytyty" , 1234,345,444);

        books.addBook(new Book(1, "Advanture Pinguin", "Pryjmak",
                "Publish ABALAHAMA", 1978, 540, 350));
        books.addBook(new Book(2, "Advanture Pinguin", "Filuk",
                "Publish ABALAHAMA", 1978, 540, 350));
        viewBooks.print((books.viewBooks()));


        viewBooks.print(("\nEnter percent -> "));
        books.reduceByPercent(inputInt());
        viewBooks.print((books.viewBooks()));

        viewBooks.print(("\nEnter author -> "));
        books.findBookByAuthor(inputLine());


    }
}
