package EmployeeManagement;

public class Main {
    public static void main(String[] args) {
        double amt = 5000;
        // Employee Emp1 = new Employee(101, "Alice", 50000.0);
        // Employee Emp2 = new Employee(102, "Bob", 60000.0);
        // Employee Emp3 = new Employee(103, "Charlie", 70000.0);
        // Emp1.details();
        // Emp2.details();
        // Emp3.details();

        Employee[] employees = {
                new Employee(101, "Alice", 50000.0),
                new Employee(102, "Bob", 60000.0),
                new Employee(103, "Charlie", 70000.0)
        };

        for (Employee emp : employees) {
            emp.details();
        }

        // Emp2.increment(amt);

        Employee bob = employees[1];
        double newSalary = bob.salaryIncrement(amt);

        // System.out.println("Increasing " + Emp2.getName() + " Salary by " + amt);

        // System.out.println("Updated " + Emp2.getName() + "'s salary " +
        // Emp2.newSalary);

        System.out.println("Increasing " + bob.getName() + " Salary by " + amt);

        System.out.println("Updated " + bob.getName() + "'s salary " + newSalary);
    }

}
