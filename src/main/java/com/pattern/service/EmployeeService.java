package com.pattern.service;

import com.pattern.entities.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAll();

    Employee findById(Long id);
}
