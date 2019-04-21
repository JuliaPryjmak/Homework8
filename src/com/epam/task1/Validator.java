package com.epam.task1;


import java.util.Scanner;

public class Validator extends Throwable {

    public static int checkID(int size) {
//        while (true) {
//            try {
//                if (size < 0) {
//                    throw new NumberFormatException("Number is nefative or equals zero");
//                } else {
//                    return size;
//                }
//            }
//            catch (NumberFormatException ex){
//                System.out.println(ex);
//                Scanner sc = new Scanner(System.in);
//                int elem = sc.nextInt();
//                return checkID(elem);

            try {
                while (size < 0) {
                    throw new NumberFormatException();
                }
                return size;
            } catch (NumberFormatException ex) {
                System.err.println("Please enter a positive whole number");
                Scanner sc = new Scanner(System.in);
                int elem = sc.nextInt();
                checkID(elem);
//

            }

return  size;
    }
}

