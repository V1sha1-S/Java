package Collection.EmployeeManagement;

public class Main {
    public static void main(String[] args) {
        // Employee[] employees = { new Employee(101, "Vishal", 20000),
        // new Employee(102, "Vishal Naik", 100000) };

        // for (Employee emp : employees) {
        // emp.displayEmployeeDetails();
        // }

        PayrollSystem empPay = new PayrollSystem();

        empPay.addEmployee(new Employee(101, "Vishal", 10000));
        empPay.addEmployee(new Employee(102, "VishalS", 120000));
        empPay.addEmployee(new Employee(103, "VishalSNaik", 130000));
        empPay.addEmployee(new Employee(104, "VishalShridharNaik", 140000));

        Employee e = empPay.searchEmployee(105);
        if (e != null) {
            System.out.println("\nFound Employee");
            e.displayEmployeeDetails();
        } else {
            System.out.println("Employee not present with the mentioned Id");
        }

        empPay.displayAll();
    }
}
