/*
 * You can use the following import statements
 * 
 * import org.springframework.web.bind.annotation.*;
 * import java.util.*;
 * 
 */

// Write your code here
package com.example.employee;

import org.springframework.web.bind.annotation.*;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.employee.EmployeeService;

@RestController
public class EmployeeController{

    @Autowired
    public EmployeeService service;

    @GetMapping("/employees")
    public ArrayList<Employee> getEmployees(){
        return  service.getEmployees();
    }
}