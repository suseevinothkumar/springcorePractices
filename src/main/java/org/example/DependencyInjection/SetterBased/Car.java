package org.example.DependencyInjection.SetterBased;

public class Car {
    private int carModel;
    private String carName;

    private Engine engine;

    public void setCarModel(int carModel) {
        this.carModel = carModel;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void getCar(){
        System.out.println("Car Model:"+carModel+" Car Name:"+carName);
        engine.getEngine();
    }
}
