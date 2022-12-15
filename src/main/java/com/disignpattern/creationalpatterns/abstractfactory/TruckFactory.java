package com.disignpattern.creationalpatterns.abstractfactory;

public class TruckFactory extends Factory {

    @Override
    public Engine getEngine() {
        return new TruckEngine();
    }

    @Override
    public Tyre getTyre() {
        return new TruckTyre();
    }
}
