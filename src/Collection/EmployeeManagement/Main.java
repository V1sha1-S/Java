package Collection.EmployeeManagement;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = { new Employee(101, "Vishal", 20000),
                new Employee(102, "Vishal Naik", 100000) };

        for (Employee emp : employees) {
            emp.displayEmployeeDetails();
        }
    }
}
