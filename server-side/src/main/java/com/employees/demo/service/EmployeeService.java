package com.employees.demo.service;

import com.employees.demo.dao.EmployeeDao;
import com.employees.demo.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    public EmployeeDao employeeDao;

    public Employee saveEmployee(Employee employee){
        return employeeDao.save(employee);
        // podemos usar este metodo por el CRUDRepository de employeeDao
    }

    public List<Employee> getAllEmployees(){
        List<Employee> employees = new ArrayList<>();
        employeeDao.findAll().forEach(employees::add);
        return employees;
    }

    public Employee getEmployeeById(Integer employeeId){
        return employeeDao.findById(employeeId).orElseThrow();
    }

    public void deleteEmployee(Integer employeeId){
        employeeDao.deleteById(employeeId);
    }

    public Employee updateEmployee(Employee employee){
        employeeDao.findById(employee.getEmployeeId()).orElseThrow();
        return employeeDao.save(employee);
    }

}
