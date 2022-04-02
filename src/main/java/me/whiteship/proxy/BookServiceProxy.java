package me.whiteship.proxy;

public class BookServiceProxy implements BookService {

    private BookService bookService;

    public BookServiceProxy(BookService bookService) {
        this.bookService = bookService;
    }

    @Override
    public void rent(Book book) {
        System.out.println("Before BookService invoke method");
        bookService.rent(new Book("jean", 30000));
        System.out.println("After BookService invoke method");
    }
}
