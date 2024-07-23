package org.example.DependencyInjection.ConstructorSetterBased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("constructor_setter_injection.xml");

        Customer customer = context.getBean("customer",Customer.class);

        customer.getCustomer();
    }
}
