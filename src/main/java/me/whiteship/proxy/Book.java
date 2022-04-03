package me.whiteship.proxy;

public class Book {

    private String author;
    private int price;

    public Book() {
    }

    public Book(String author, int price) {
        this.author = author;
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }
}
