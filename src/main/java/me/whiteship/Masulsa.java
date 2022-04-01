package me.whiteship;

import net.bytebuddy.ByteBuddy;
import net.bytebuddy.implementation.FixedValue;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

import static net.bytebuddy.matcher.ElementMatchers.named;

public class Masulsa {

    public static void main(String[] args) {

       /* try {
            new ByteBuddy().redefine(Moja.class)
                    .method(named("pullOut")).intercept(FixedValue.value("Rabbit!"))
                    .make().saveIn(new File("/Users/limjun-young/workspace/privacy/dev/javacode/target/classes/"));
        } catch (IOException e) {
            e.printStackTrace();
        }*/

        Class<Moim> moimClass = Moim.class;

        System.out.println(new Moja().pullOut());
        Arrays.stream(moimClass.getDeclaredFields()).forEach(System.out::println);
    }
}
