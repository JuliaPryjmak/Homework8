package com.epam.task1.controller;

import com.epam.task1.Validator;
import com.epam.task1.model.Book;
import com.epam.task1.model.Books;
import com.epam.task1.view.BookView;




import static com.epam.task1.controller.InputUtilityХ.inputInt;
import static com.epam.task1.controller.InputUtilityХ.inputLine;


public class BooksController {

    private Books books;
    private Book model;
    private BookView viewBooks = new BookView();



    public void run() throws Validator {
        viewBooks.print("Enter size -> ");
        books = new Books(inputInt());
//        Book book1 = new Book(InputUtility.inputInt(), InputUtility.inputLine(),InputUtility.inputLine(),InputUtility.inputLine(),
//                InputUtility.inputInt(), InputUtility.inputInt(),InputUtility.inputInt());
        //  Book book1 = new Book(1,"ter", "erere", "tytytyty" , 1234,345,444);

        books.addBook(new Book(1, "Advanture Pinguin", "Yryjmak",
                "Publish ABALAHAMA", 1978, 540, 350));
        books.addBook(new Book(2, "Sdvanture Pinguin", "Wiluk",
                "BPublish ABALAHAMA", 1978, 540, 850));
        books.addBook(new Book(2, "Mdvanture Pinguin", "Ciluk",
                "SPublish ABALAHAMA", 1978, 540, 650));
//        books.addBook(new Book(2, "Advanture Pinguin", "Filuk",
//                "Publish ABALAHAMA", 1978, 540, 350));
//        viewBooks.print((books.viewBooks()));
//        books.addBook(new Book(inputInt(), inputLine(), inputLine(), inputLine(), inputInt(), inputInt(), inputInt()));
        books.addBook(new Book(2, "Advanture Pinguin", "Filuk",
                "Publish ABALAHAMA", 1978, 540, 350));
        viewBooks.print((books.viewBooks()));

        System.out.println("Sort by author of book:\n " + books.sortByNameAuthor());
        System.out.println("Sort by Publishing organization of book:\n " + books.sortByPublishOffice());
        System.out.println("Sort by price of book:\n " + books.sortByPrice());

        viewBooks.print(("\nEnter percent -> "));
        books.reduceByPercent(inputInt());
        viewBooks.print((books.viewBooks()));

        viewBooks.print(("\nEnter author -> "));
        String bookByAuthor = books.findBookByAuthor(inputLine());
        viewBooks.print(bookByAuthor);


    }
}
