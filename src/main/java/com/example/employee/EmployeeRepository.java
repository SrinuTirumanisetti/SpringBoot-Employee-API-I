// Write your code here

package com.example.employee;
import java.util.ArrayList;
import com.example.employee.Employee;

public interface EmployeeRepository{
    ArrayList<Employee> getEmployees();
    Employee addEmployee(Employee employee);
    Employee getEmployeeById(int employeeId);
    Employee updateEmployee(int employeeId,Employee employee);
}