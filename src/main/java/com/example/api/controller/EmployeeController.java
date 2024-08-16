package com.example.api.controller;

import com.example.api.dto.EmployeeDto;
import com.example.api.model.Department;
import com.example.api.model.Employee;
import com.example.api.service.DepartmentService;
import com.example.api.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private DepartmentService departmentService;

    @GetMapping("/employees")
    public Iterable<Employee> getEmployees() {
        return employeeService.getEmployees();
    }

    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody EmployeeDto employee) {
        Optional<Department> optionalDepartment = departmentService.getDepartment(employee.getDepartmentId());
        if (!optionalDepartment.isPresent()) {
            throw new RuntimeException("Department not found");
        }
        Department department = optionalDepartment.get();
        Employee newEmployee = new Employee();
        newEmployee.setFirstName(employee.getFirstName());
        newEmployee.setLastName(employee.getLastName());
        newEmployee.setDepartment(department);
        return employeeService.saveEmployee(newEmployee);
    }

    @DeleteMapping("/employees/{id}")
    public void deleteEmployee(@PathVariable long id) {
        employeeService.deleteEmployee(id);
    }
}
