package com.disignpattern.creationalpatterns.abstractfactory;

public class TruckEngine implements Engine {

    public TruckEngine() {
    }

    @Override
    public void design() {
        System.out.println("Design TruckEngine");
    }

    @Override
    public void manufacture() {
        System.out.println("Manufacture TruckEngine");
    }

    @Override
    public void test() {
        System.out.println("Teste TruckEngine");
    }
}
