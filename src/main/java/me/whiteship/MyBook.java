package me.whiteship;

@MyAnnotation(value = "jean", number = 29)
public class MyBook {

    private String author = "jeancalm";

    private int price = 3000;

    public MyBook() {

    }

    public MyBook(String author, int price) {
        this.author = author;
        this.price = price;
    }

    public String showBookInfo() {
        return "책저자: " + this.author + ", 가격은 " + this.price + "입니다.";
    }
}
