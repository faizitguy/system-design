package com.inheritence;

public class Mammal extends Animal{

    public Mammal(String name) {
        super(name);
    }

    public void walk() {
        System.out.println("walking...");
    }
}
