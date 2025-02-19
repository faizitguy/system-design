package com.polymorphism;

public class MathOperations {

    public int multiply(int a, int b) {
        return a * b;
    }

    public int multiply(int a, int b, int c) {
        return a * b * c;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public static void main(String[] args) {
        MathOperations mathOps = new MathOperations();

        int result1 = mathOps.multiply(2, 3);
        System.out.println("2 * 3 = " + result1);

        int result2 = mathOps.multiply(2, 3, 4);
        System.out.println("2 * 3 * 4 = " + result2);

        double result3 = mathOps.multiply(2.5, 3.5);
        System.out.println("2.5 * 3.5 = " + result3);
    }
}
