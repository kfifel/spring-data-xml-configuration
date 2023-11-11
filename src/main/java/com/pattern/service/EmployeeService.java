package com.pattern.service;

import com.pattern.entities.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    List<Employee> findAll();
    Employee save(Employee employee);
    Optional<Employee> findByUsername(String username);
    Employee findById(Long id);
}
