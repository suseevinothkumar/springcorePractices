package org.example.ConfigBased.JavaBased;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Date;

public class MainClass {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext("org.example.JavaBased");
        Date date = context.getBean("date", Date.class);

       // ApplicationContext context = new AnnotationConfigApplicationContext();

        Date date1 = context.getBean("date", Date.class);

        System.out.println(date1.getTime());



    }
    }

