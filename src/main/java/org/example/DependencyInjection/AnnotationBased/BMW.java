package org.example.DependencyInjection.AnnotationBased;

import org.springframework.stereotype.Component;

@Component
public class BMW implements  Vehicle{

    @Override
    public void run() {
        System.out.println("BMW class");
    }
}
