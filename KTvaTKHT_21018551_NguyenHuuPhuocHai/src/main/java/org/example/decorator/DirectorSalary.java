package org.example.decorator;

public class DirectorSalary extends SalaryDecorator {
    public DirectorSalary(SalaryDecorator salaryDecorator) {
        super(salaryDecorator);
    }

     @Override
    public int getSalary() {
        return employee.getSalary() + 10000000;
     }
}
