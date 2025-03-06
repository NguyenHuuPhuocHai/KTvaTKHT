package org.example.decorator;

public abstract class SalaryDecorator extends Employee{
    protected Employee employee;

    public SalaryDecorator(Employee employee) {
        super(employee.name, employee.baseSalary);
        this.employee = employee;
    }

    public abstract int getSalary();
}
