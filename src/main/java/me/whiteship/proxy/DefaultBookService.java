package me.whiteship.proxy;

public class DefaultBookService implements BookService {

    @Override
    public void rent(Book book) {
        System.out.println("rent Book");
    }
}
