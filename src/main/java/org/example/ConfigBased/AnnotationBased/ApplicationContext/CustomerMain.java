package org.example.ConfigBased.AnnotationBased.ApplicationContext;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CustomerMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("org.example.AnnotationConfig.ApplicationContext ");

        Customer customer = context.getBean("customer", Customer.class);
        customer.setCustomerId(1);
        customer.setCustomerName("Susee");
        System.out.println(customer.getCustomerId());
        System.out.println(customer.getCustomerName());
    }
}
