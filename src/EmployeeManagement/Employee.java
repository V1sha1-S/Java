package EmployeeManagement;

public class Employee {
    private int id;
    private String name;
    private double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    double newSalary;

    public double salaryIncrement(double amt) {
        return salary += amt;
    }

    public void details() {
        System.out.println("Id=" + this.id + ", " + "Name=" + this.name + ", " +
                "Salary=" + this.salary);
    }

}
