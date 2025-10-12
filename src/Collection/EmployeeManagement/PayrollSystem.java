package Collection.EmployeeManagement;

import java.util.ArrayList;

public class PayrollSystem {

    ArrayList<Employee> empList = new ArrayList<>();

    public void addEmployee(Employee e) {
        empList.add(e);
    }

    public Employee searchEmployee(int id) {
        for (Employee emp : empList) {
            if (emp.getEmpId() == id) {
                return emp;
            }
        }
        return null;
    }

    public Employee highestSalary() {
        if (empList.isEmpty()) {
            return null;
        }

        Employee highest = empList.get(0);

        for (Employee emp : empList) {
            if (emp.getSalary() > highest.getSalary()) {
                highest = emp;
            }
        }

        return highest;
    }

    public void displayAll() {
        if (empList.isEmpty()) {
            System.out.println("No Employees are available");
        } else {
            for (Employee emp : empList) {
                emp.displayEmployeeDetails();
            }
        }
    }

}
