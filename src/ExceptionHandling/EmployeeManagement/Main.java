package ExceptionHandling.EmployeeManagement;

public class Main {
    public static void main(String[] args) {
        EmployeeData employee = new EmployeeData();

        employee.addEmployee(new Employee(101, "Vishal", 50000));
        employee.addEmployee(new Employee(102, "VishalS", 100000));
        employee.addEmployee(new Employee(104, "VishalSNaik", 10000));

        employee.displayAllEmployees();
        System.out.println(employee.getEmloyeeById(102));

    }
}
