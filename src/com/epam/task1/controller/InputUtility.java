package com.epam.task1.controller;



import java.util.Scanner;

public class InputUtility {

    public static String inputLine() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static int inputInt() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
}
