package org.example.DependencyInjection.AnnotationBased;

import org.springframework.stereotype.Component;

@Component
public class Maruti implements  Vehicle{

    @Override
    public void run() {
        System.out.println("Maruti class");
    }
}