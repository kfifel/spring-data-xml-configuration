package com.pattern.service;

import com.pattern.entities.Employee;
import com.pattern.repository.EmployeeRepository;

import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<Employee> findAll(){
        return employeeRepository.findAll();
    }

    @Override
    public Employee findById(Long id){
        return employeeRepository.findById(id).orElse(null);
    }
}
