package org.example.DependencyInjection.AnnotationBased;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/*
1)@Autowired
    (a)Match by Type
    (b)Match by Qualifier
    (c)Match by Name
2)@Inspect
    (a)Match by Type
    (b)Match by Qualifier
    (c)Match by Name
3)@Resource
    (a)Match by Name
    (b)Match by Type
    (c)Match by Qualifier
 */
@Component
public class User {

    @Autowired

    // @Qualifier("audi") //Match by Qualifier - if it has ambiquity
    // Vehicle vehicle;

    //Audi maruti; // Match by Type (Class -bean)  - Audi

    Vehicle maruti ; //Match by Name -- maruti (bean name)

    public void  print(){
        maruti.run();
    }
}
