package me.whiteship;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ApplicationStarter {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

        Class<?> bookClass = Class.forName("me.whiteship.MyBook");
        Constructor<?> bookClassConstructor = bookClass.getConstructor(String.class, int.class);

        MyBook myBook = (MyBook) bookClassConstructor.newInstance("임준영", 13000);
        //System.out.println(myBook.showBookInfo());

        Method method = MyBook.class.getDeclaredMethod("showBookInfo");
        method.setAccessible(true);
        String result = (String) method.invoke(myBook);
        System.out.println(result);
    }
}
