package com.employees.demo.controller;

import com.employees.demo.entity.Employee;
import com.employees.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/employee/save")
    public Employee saveEmployee(@RequestBody Employee employee){
        return employeeService.saveEmployee(employee);
    }

    @GetMapping("/employee/getAll")
    public List<Employee> getAllEmployees(){
        return employeeService.getAllEmployees();
    }

    @GetMapping("/employee/getOne/{employeeId}")
    public Employee getEmployee(@PathVariable Integer employeeId){
        return employeeService.getEmployeeById(employeeId);
    }

    @DeleteMapping("/employee/deleteOne/{employeeId}")
    public void deleteEmployee(@PathVariable Integer employeeId){
        employeeService.deleteEmployee(employeeId);
    }

    @PutMapping("/employee/updateOne")
    public Employee updateEmployee(@RequestBody Employee employee){
        return employeeService.updateEmployee(employee);
    }

}
