package com.epam.task1.model;



public class Books {

    public static Book[] library;
    private int count = 0;


    public Books(int arraiSize) {
        library = new Book[arraiSize];
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
            books += library[i].view();
            books += "\n";
        }
        return books;
    }

    public void reduceByPercent(int percent) {
        System.out.println("Change price by: " + percent + "%");
        for (int i = 0; i < count; i++) {
            library[i].changePrice(percent);
        }
    }

    public void findBookByAuthor(String author) {
        for(int i=0; i<count; i++) {
            if(library[i].getAuthorBook().equalsIgnoreCase(author)) {
                System.out.println(library[i].view());
            }
        }
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
//                Books list = new Books(count);
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



