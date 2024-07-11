package com.lambdapractice;

import java.security.PrivilegedAction;
import java.util.EventListener;
import java.util.Map;
import java.util.function.Function;

public class LambdaPractice implements AbstractClass {
    @Override
    public void method1() {
        System.out.println("pushfromCLI");
    }

    public static void main(String[] args) {
        AbstractClass lambda = () -> {System.out.println("h");
            System.out.println("mmk");};
        lambda.method1();
        AbstractClass mk = new LambdaPractice();
        mk.method1();

        Runnable lambda1 = () -> {;
            System.out.println();};
        lambda1.run();
        Function<String,Integer> upper = s->s.indexOf("m");
        System.out.println(upper.apply("mk"));

    }
}