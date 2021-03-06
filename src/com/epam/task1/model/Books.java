package com.epam.task1.model;


import java.util.Arrays;
import java.util.Comparator;


import static com.epam.task1.Validator.check;
import static com.epam.task1.Validator.checkName;

public class Books {

    public static Book[] library;
    private int count = 0;


    public Books(int arraiSize) {
        int i = check(arraiSize);
        library = new Book[i];
    }

    public boolean addBook(Book book) {
        if (count == library.length) {
            return false;
        } else {
            library[count++] = book;
            return true;
        }

    }

    public String viewBooks() {
        if (count == 0) {
            return "No books!";
        }
        String books = "";

        for (int i = 0; i < count; i++) {
            books += library[i].toString();
            books += "\n";
        }
        return books;
    }

    private String viewLibrary(Book[] array, int size) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < size; i++) {
            result.append(array[i] + "\n");
        }
        return result.toString();
    }

    public void reduceByPercent(int percent) {
        int newPercent = check(percent);
        System.out.println("Change price by: " + newPercent + "%");
        for (int i = 0; i < count; i++) {
            library[i].changePrice(newPercent);
        }
    }

    public String findBookByAuthor(String author) {
        String newAuthor = checkName(author);
        String books = "";
        for (int i = 0; i < count; i++) {
            if (library[i].getAuthorBook().equalsIgnoreCase(newAuthor)) {
                books += library[i].toString() + "\n";
            } else {
                System.out.println("No books");
                break;
            }
        }
        return books;
    }

    public String sortByNameAuthor() {
        Book[] newLibrary = Arrays.copyOf(library, count);
        Arrays.sort(newLibrary, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return (o1.getAuthorBook().compareTo(o2.getAuthorBook()));
            }
        });
        return viewLibrary(newLibrary, newLibrary.length);
    }

    public String sortByPublishOffice() {
        Book[] newLibrary = Arrays.copyOf(library, count);
        Arrays.sort(newLibrary, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getPublishingOffice().compareTo(o2.getPublishingOffice());
            }
        });
        return viewLibrary(newLibrary, newLibrary.length);
    }

    public String sortByPrice() {
        Book[] newLibrary = Arrays.copyOf(library, count);
        Arrays.sort(newLibrary, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                if (o1.getPrice() > o2.getPrice()) return -1;
                if (o1.getPrice() < o2.getPrice()) return 1;
                return 0;

            }
        });
        return viewLibrary(newLibrary, newLibrary.length);
    }


}




