package com.epam.task1.controller;


import com.epam.task1.view.BookView;

import java.util.Scanner;

class InputUtilityХ {


    public static String inputLine() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    public static int inputInt() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();


    }

    public static int inputID() {
        System.out.println(BookView.ENTER_ID);
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();


    }

    public static int inputYearOfPublishing() {
        System.out.println(BookView.ENTER_YEAR_OF_PUBLISHING);
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public static String inputNameOfBook() {
        System.out.println(BookView.ENTER_NAME_BOOK);
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    public static String inputAuthorOfBook() {
        System.out.println(BookView.ENTER_AUTHOR_BOOK);
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    public static String inputPublishingOffice() {
        System.out.println(BookView.ENTER_PUBLISHING_OFFICE);
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    public static int inputNumberOfPages() {
        System.out.println(BookView.ENTER_NUMBER_OF_PAGES);
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public static int inputPrice() {
        System.out.println(BookView.ENTER_PRICE);
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

}