package me.whiteship.proxy;

import org.junit.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class BookServiceTests {

    //BookService bookService = new BookServiceProxy(new DefaultBookService());

    BookService bookService = (BookService) Proxy.newProxyInstance(BookService.class.getClassLoader(), new Class[]{BookService.class}, new InvocationHandler() {

        BookService bookService = new DefaultBookService();

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

            if (method.getName().equals("rent")) {
                System.out.println("Before invoke");
                Object invoke = method.invoke(bookService, args);
                System.out.println("After invoke");
                return invoke;
            }

            return method.invoke(bookService, args);
        }
    });


    @Test
    public void rent() {
        bookService.rent(new Book("jean", 30000));
        System.out.printf("######################################### \n");
        bookService.returnBook(new Book("jean", 30000));
    }
}
