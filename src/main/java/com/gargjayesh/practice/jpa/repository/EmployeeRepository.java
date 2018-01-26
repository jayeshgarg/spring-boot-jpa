package com.gargjayesh.practice.jpa.repository;

import com.gargjayesh.practice.jpa.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    Employee findByEmployeeName(String employeeName);

    Employee findByManagerEmployeeName(String employeeName);
}
