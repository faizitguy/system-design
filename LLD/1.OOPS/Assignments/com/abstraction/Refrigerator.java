package com.abstraction;

public class Refrigerator implements Appliance{
    @Override
    public void turnOn() {
        System.out.println("Refrigerator is now ON.");
    }

    public static void main(String[] args) {
        // Create instances of WashingMachine and Refrigerator
        Appliance myWashingMachine = new WashingMachine();
        Appliance myRefrigerator = new Refrigerator();

        // Call the turnOn method on each instance
        myWashingMachine.turnOn();  // Output: Washing machine is now ON.
        myRefrigerator.turnOn();    // Output: Refrigerator is now ON.
    }
}
