package com.polymorphism;

public class Car implements Movable{

    @Override
    public void move() {
        System.out.println("The car is Moving!");
    }
}
