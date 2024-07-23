package org.example.DependencyInjection.SetterBased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("setterInjection.xml");
        Car car = context.getBean("car",Car.class);
        car.getCar();
    }

}
