package com.polymorphism;

public class Circle extends Shape{

    @Override
    public void draw() {
        System.out.println("Drawing a Circle");
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.draw();
    }
}
