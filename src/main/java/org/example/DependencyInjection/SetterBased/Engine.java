package org.example.DependencyInjection.SetterBased;

public class Engine {

    private String engineType;

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public void getEngine(){
        System.out.println("Engine Type: "+ engineType);
    }
}
