package com.epam.task1.model;

import com.epam.task1.Validator;

import static com.epam.task1.Validator.*;

public class Book {
    private int idBook;
    private String nameBook;
    private String authorBook;
    private String publishingOffice;
    private int yearOfPublishing;
    private int numberOfPages;
    private float price;

    public Book(int idBook, String nameBook, String authorBook, String publishingOffice,
                int yearOfPublishing, int numberOfPages, float price) throws Validator {
        this.idBook = checkIdOfBook(idBook);
        this.nameBook = checkName(nameBook);
        this.authorBook = checkName(authorBook);
        this.publishingOffice = checkName(publishingOffice);
        this.yearOfPublishing = checkYearOfPublishing(yearOfPublishing);
        this.numberOfPages = checkNumberOfPages(numberOfPages);
        this.price = checkPrice(price);
    }

    public int getIdBook() {
        return idBook;
    }

    public void setIdBook(int idBook) {
        this.idBook = checkIdOfBook(idBook);
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = checkName(nameBook);
    }

    public String getAuthorBook() {
        return authorBook;
    }

    public void setAuthorBook(String authorBook) {
        this.authorBook = checkName(authorBook);
    }

    public String getPublishingOffice() {
        return publishingOffice;
    }

    public void setPublishingOffice(String publishingOffice) {
        this.publishingOffice = checkName(publishingOffice);
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = checkYearOfPublishing(yearOfPublishing);
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = checkNumberOfPages(numberOfPages);
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = checkPrice(price);
    }


    @Override
    public String toString() {
        return "Book: " +
                "idBook=" + idBook +
                ", nameBook='" + nameBook + '\'' +
                ", authorBook='" + authorBook + '\'' +
                ", publishingOffice='" + publishingOffice + '\'' +
                ", yearOfPublishing=" + yearOfPublishing +
                ", numberOfPages=" + numberOfPages +
                ", price=" + price;
    }


    public void changePrice(double percent) {
        this.price = (float) (price + price * percent / 100);
    }


}
