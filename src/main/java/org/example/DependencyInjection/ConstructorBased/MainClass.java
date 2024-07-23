package org.example.DependencyInjection.ConstructorBased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

    public static void main(String[] args) {

        ApplicationContext context= new ClassPathXmlApplicationContext("constructorInjection.xml" );

        Employee emp = context.getBean("employee",Employee.class);
        emp.getEmpDetails();


    }
}
