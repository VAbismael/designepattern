package com.disignpattern.creationalpatterns.abstractfactory;

public class CarTyre implements Tyre {

    @Override
    public void design() {
        System.out.println("Design CarTyre");
    }

    @Override
    public void manufacture() {
        System.out.println("Manufacture CarTyre");
    }
}
