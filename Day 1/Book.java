package com.example.ooplab.week1;

public class Book {
    
    private int id;
    private String title;
    private String author;
    private String publisher;
    private int year;
    private String isbn;
    private double price;

    // Default constructor
    public Book() {
    }

    // Parameterized constructor
    public Book(int id, String title, String author,
                String publisher, int year,
                String isbn, double price) {

        this.id = id;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.year = year;
        this.isbn = isbn;
        this.price = price;
    }

    // Copy constructor
    public Book(Book book) {
        this.id = book.id;
        this.title = book.title;
        this.author = book.author;
        this.publisher = book.publisher;
        this.year = book.year;
        this.isbn = book.isbn;
        this.price = book.price;
    }

    public void displayDetails() {
        System.out.println("ID: " + id);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Publisher: " + publisher);
        System.out.println("Year: " + year);
        System.out.println("ISBN: " + isbn);
        System.out.println("Price: " + price);
    }

    public boolean matches(String keyword) {
        return title.toLowerCase().contains(keyword.toLowerCase())
                || author.toLowerCase().contains(keyword.toLowerCase());
    }

    public void applyDiscount(double percentage) {
        price = price - (price * percentage / 100);
    }

    // Getters and setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
