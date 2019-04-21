package com.epam.task1.model;


import com.epam.task1.Validator;
import com.sun.xml.internal.ws.client.BindingProviderProperties;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

import static com.epam.task1.Validator.checkID;

public class Books {

    public static Book[] library;
    private int count = 0;


    public Books(int arraiSize){
        checkID(arraiSize);
            library = new Book[arraiSize];
//        } else {
//            System.out.println("Repeat enter please");
//
//        }
    }

    public boolean addBook(Book book) {
        if (count == library.length){
            return false;
        }else {
            library[count++] = book;
            return  true;
        }

    }

    public String viewBooks() {
        if (count == 0){
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
        System.out.println("Change price by: " + percent + "%");
        for (int i = 0; i < count; i++) {
            library[i].changePrice(percent);
        }
    }

    public String findBookByAuthor(String author) {
        String books = "";
        for(int i=0; i<count; i++) {
            if(library[i].getAuthorBook().equalsIgnoreCase(author)) {
                books += library[i].toString() + "\n";
            }
        }
        return books;
    }
    public String sortByNameAuthor(){
        Book[] newLibrary = Arrays.copyOf(library, count);
        Arrays.sort(newLibrary, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return( o1.getAuthorBook().compareTo(o2.getAuthorBook()));
            }
        });
        return  viewLibrary(newLibrary, newLibrary.length);
    }

        public String sortByPublishOffice() {
            Book[] newLibrary = Arrays.copyOf(library, count);
            Arrays.sort(newLibrary, new Comparator<Book>() {
                @Override
                public int compare(Book o1, Book o2) {
                    return o1.getPublishingOffice().compareTo(o2.getPublishingOffice());
                }
            });
    return  viewLibrary(newLibrary, newLibrary.length);
    }
    public String sortByPrice(){
        Book[] newLibrary = Arrays.copyOf(library,count);
        Arrays.sort(newLibrary, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                if (o1.getPrice() > o2.getPrice()) return -1;
                if (o1.getPrice() < o2.getPrice()) return 1;
                return 0;

            }
        });
        return  viewLibrary(newLibrary, newLibrary.length);
    }


}

//            Book x = massive[i];
//            int price = x.getPrice();
//            int newPercent = (int) (0.01 * persent * price);
//            x.setPrice(price - newPercent);
//        }
//    }


//    static Book[] reduceByPercent(Book[] massive) {
//        System.out.println("Введите процент: ");
//        Scanner sc = new Scanner(System.in);
//        int percent = sc.nextInt();
//        for (int i = 0; i < count; i++) {
//            Book x = massive[i];
//            int price = x.getPrice();
//            int newPercent = (int) (0.01 * percent * price);
//            x.setPrice(price - newPercent);
//        }
//        return massive;
//    }


           //Book x = massive[i];
           // String author = x.getAuthorBook();
//            if (author.equals(wordAuthor)) {
//                x.view();
//            if (massive[i].getAuthorBook().equals(wordAuthor)){
//
//            }
//        }

//
//    static public Book searchBookByYear( int year) {
////            System.out.println("Введите автора: ");
//           Scanner sc = new Scanner(System.in);
//               year = sc.nextInt();
//
//            if (year > 0) {
//                Books list = newб Books(count);
//                for (int i = 0; i < count; i++) {
//                    if (massive[i].getYearOfPublishing().equals(year)) ;
//                    list.addBook(massive[i]);
//                }
//                return list;
//            } else {
//                return new Books(0);
//
//            }
//
//        }


//        for (int i = 0; i < count; i++) {
//            Book x = massive[i];
//            int yearOfPublishing = x.getYearOfPublishing();
//            if (newYear < yearOfPublishing) {
//                x.view();
//            }
//        }
//        return massive[0];
//    }



