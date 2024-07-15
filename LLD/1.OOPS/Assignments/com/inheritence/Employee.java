package com.inheritence;

public class Employee extends Person{
    private String employeeId;

    public Employee(String name, int age,  String employeeId) {
        super(name, age);
        this.employeeId = employeeId;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println(" com.inheritence.Employee ID: " + employeeId);
    }

    public static void main(String[] args) {
        Employee emp = new Employee("Faiz", 26, "123456");
        emp.displayDetails();
    }
}
