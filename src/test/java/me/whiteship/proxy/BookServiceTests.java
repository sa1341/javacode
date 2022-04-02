package me.whiteship.proxy;

import org.junit.Test;

public class BookServiceTests {

    BookService bookService = new BookServiceProxy(new DefaultBookService());

    @Test
    public void rent() {
        bookService.rent(new Book("jean", 30000));
    }
}
