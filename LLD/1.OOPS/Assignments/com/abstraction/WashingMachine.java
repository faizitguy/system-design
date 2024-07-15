package com.abstraction;

public class WashingMachine implements Appliance{
    @Override
    public void turnOn() {
        System.out.println("Washing machine is now ON.");
    }
}
