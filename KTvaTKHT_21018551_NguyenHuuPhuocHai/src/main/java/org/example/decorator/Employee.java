package org.example.decorator;

public class Employee {
    protected String name;
    protected int baseSalary;

    public Employee(String name, int baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public int getSalary() {
        return baseSalary;
    }

    public void displaySalary() {
        System.out.println(name + " - Lương: " + getSalary());
    }
}
