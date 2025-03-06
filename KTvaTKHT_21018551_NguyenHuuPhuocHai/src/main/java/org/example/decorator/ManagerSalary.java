package org.example.decorator;

public class ManagerSalary extends SalaryDecorator{
    public ManagerSalary(Employee employee) {
        super(employee);
    }

    @Override
    public int getSalary() {
        return employee.getSalary() + 5000000; // Phụ cấp TP
    }
}
