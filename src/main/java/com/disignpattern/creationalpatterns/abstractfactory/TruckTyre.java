package com.disignpattern.creationalpatterns.abstractfactory;

public class TruckTyre implements Tyre {

    @Override
    public void design() {
        System.out.println("Design Truckyre");
    }

    @Override
    public void manufacture() {
        System.out.println("Manufacture TruckTyre");
    }
}
