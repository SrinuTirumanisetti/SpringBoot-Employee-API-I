/*
 * You can use the following import statements
 * 
 * import org.springframework.web.bind.annotation.*;
 * import java.util.*;
 * 
 */

package com.example.employee;

import org.springframework.web.bind.annotation.*;
import java.util.*;
import com.example.employee.EmployeeService;
import com.example.employee.Employee;

@RestController
public class EmployeeController {

    EmployeeService service = new EmployeeService();

    @GetMapping("/employees")
    public ArrayList<Employee> getEmployees() {
        return service.getEmployees();
    }

    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee employee) {
        return service.addEmployee(employee);
    }

    @GetMapping("/employees/{employeeId}")  // Fixed: added leading slash
    public Employee getEmployeeById(@PathVariable("employeeId") int employeeId) {
        return service.getEmployeeById(employeeId);
    }

    @PutMapping("/employees/{employeeId}")
    public Employee updateEmployee(@PathVariable("employeeId") int employeeId,
                                   @RequestBody Employee employee) {
        return service.updateEmployee(employeeId, employee);
    }

    @DeleteMapping("/employees/{employeeId}")
    public void deleteEmployee(@PathVariable("employeeId") int employeeId) {
        service.deleteEmployee(employeeId);
    }
}
