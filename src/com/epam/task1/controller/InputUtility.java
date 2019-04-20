package com.epam.task1.controller;


import com.epam.task1.view.BookView;

import java.util.Scanner;

public class InputUtility {
    private static Scanner sc = new Scanner(System.in);
    public static String inputLine () {
        return sc.nextLine();
    }

    public static int inputInt (){
        return  sc.nextInt();
    }
}
