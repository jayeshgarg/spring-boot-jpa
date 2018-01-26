package com.gargjayesh.practice.jpa.service;

import com.gargjayesh.practice.jpa.entities.Employee;
import com.gargjayesh.practice.jpa.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public List<Employee> addNewEmployee(Employee newEmployee) {
        employeeRepository.save(newEmployee);
        return getAllEmployees();
    }

    public Employee getByEmployeeName(String employeeName) {
        return employeeRepository.findByEmployeeName(employeeName);
    }

    public Employee getByEmployeeManager(String managerName){
        return employeeRepository.findByManagerEmployeeName(managerName);
    }
}
