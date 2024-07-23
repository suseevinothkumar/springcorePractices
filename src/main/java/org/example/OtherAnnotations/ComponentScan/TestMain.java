package org.example.OtherAnnotations.ComponentScan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMain {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("org.example.OtherAnnotations.ComponentScan");
        ApacReport report = context.getBean("apacReport", ApacReport.class);
        report.getReport();

    }
}
