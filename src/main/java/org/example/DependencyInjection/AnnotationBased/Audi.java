package org.example.DependencyInjection.AnnotationBased;

import org.springframework.stereotype.Component;

@Component
public class Audi implements  Vehicle{

    @Override
    public void run() {
        System.out.println("Audi class");
    }
}
