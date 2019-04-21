package com.epam.task1;


import sun.util.calendar.BaseCalendar;

import java.util.*;

public class Validator extends Throwable {

    public static int checkID(int size) {
        int elem;
        try {
            if (size <= 0) {
                throw new NumberFormatException();
            } else
                return size;
        } catch (NumberFormatException ex) {
            do {
                System.err.println("Please enter a positive whole number: ");
                Scanner sc = new Scanner(System.in);
                elem = sc.nextInt();
            } while (elem <= 0);

        }
        return elem;
    }

    public static int checkIdOfBook(int size) {
        int elem;
        try {
            if (size <= 0) {
                throw new NumberFormatException();
            } else
                return size;
        } catch (NumberFormatException ex) {
            do {
                System.err.println("Please enter a positive whole number for ID book: ");
                Scanner sc = new Scanner(System.in);
                elem = sc.nextInt();
            } while (elem <= 0);

        }
        return elem;

    }

    public static int checkNumberOfPages(int size) {
        int elem;
        try {
            if (size <= 0) {
                throw new NumberFormatException();
            } else
                return size;
        } catch (NumberFormatException ex) {
            do {
                System.err.println("Please enter a positive whole number for Number of Pages: ");
                Scanner sc = new Scanner(System.in);
                elem = sc.nextInt();
            } while (elem <= 0);

        }
        return elem;
    }

    public static int checkYearOfPublishing(int size) {
        int elem;
        try {
            GregorianCalendar calendar = new GregorianCalendar(size, 0,0);
            if (calendar.get(Calendar.YEAR) <= 1870 && calendar.get(Calendar.YEAR)  > 2019 ){
                throw new NumberFormatException();
            }
            return size;
        } catch (NumberFormatException ex) {
            do {
                System.err.println("Please enter the right whole number Year of publishing book: ");
                Scanner sc = new Scanner(System.in);
                elem = sc.nextInt();
            } while (elem <= 0);

        }
        return elem;
    }


    public static String checkNameOfBook(String element) {
        String elem;

        try {
            if (element.charAt(0) != element.toUpperCase().charAt(0)) {
                throw new InputMismatchException();
            }
            return element;
        } catch (InputMismatchException ex) {
            do {
                System.err.println("You entered the wrong text for Name of book!Please entered the right text: ");
                Scanner sc = new Scanner(System.in);
                elem = sc.nextLine();

            }
            while ((element.charAt(0) == element.toUpperCase().charAt(0)));

        }
        return elem;
    }
}

//        String elem;
//        try {
//           Character ch = element.charAt(0);
//           if(Character.isLowerCase(ch)){
//               throw InputMismatchException;
//           }
//           return element;
//        }catch(InputMismatchException ex){
//            do {
//                System.err.println("You entered the text for Name of book!Please entered the right text: ");
//                Scanner sc = new Scanner(System.in);
//                elem = sc.nextLine();
//            }while (elem);
//        }



