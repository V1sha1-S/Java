package Collection.EmployeeManagement;

public class Employee {
    private int empId;
    protected String name;
    private double salary;

    Employee(int empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    public int getEmpId() {
        return empId;
    }

    public double getSalary() {
        return salary;
    }

    public void displayEmployeeDetails() {
        System.out.println("Employee Id: " + empId + " Employee Name: " + name + " Employee Salary " + salary);
    }
}
