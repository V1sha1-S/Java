package ExceptionHandling.EmployeeManagement;

import java.util.HashMap;

class EmployeeData {

    HashMap<Integer, Employee> employees = new HashMap<>();

    public void addEmployee(Employee employee) {
        employees.put(employee.getEmpId(), employee);
    }

    public void displayAllEmployees() {
        for (Employee emp : employees.values()) {
            emp.displayEmployeeDetails();
        }
    }

    public Employee getEmloyeeById(int empId) {
        return employees.get(empId);
    }
}
