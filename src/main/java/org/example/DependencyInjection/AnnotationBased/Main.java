package org.example.DependencyInjection.AnnotationBased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext("org.example.DependencyInjection.AnnotationBased");

        User user = context.getBean("user",User.class);

        user.print();
    }
}
