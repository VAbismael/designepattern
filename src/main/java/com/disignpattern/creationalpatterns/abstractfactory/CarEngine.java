package com.disignpattern.creationalpatterns.abstractfactory;

public class CarEngine implements Engine {

    public CarEngine() {
    }

    @Override
    public void design() {
        System.out.println("Design CarEngine");
    }

    @Override
    public void manufacture() {
        System.out.println("Manufacture CarEngine");
    }

    @Override
    public void test() {
        System.out.println("Teste CarEngine");
    }
}
