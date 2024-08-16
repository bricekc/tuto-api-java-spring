package com.example.api.controller;

import com.example.api.model.Employee;
import com.example.api.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeControllerView {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees/view")
    public String viewEmployees(Model model) {
        Iterable<Employee> employees = employeeService.getEmployees();
        model.addAttribute("employees", employees);
        return "employee";
    }
}
