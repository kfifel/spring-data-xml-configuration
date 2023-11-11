package com.pattern.service;

import com.pattern.entities.Employee;
import com.pattern.repository.EmployeeRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
    public Employee save(Employee employee) {
        if(findByUsername(employee.getUsername()).isPresent())
            throw new IllegalArgumentException("Employee Already exists with this username");
        return employeeRepository.save(employee);
    }

    @Override
    public Optional<Employee> findByUsername(String username) {
        return employeeRepository.findByUsername(username);
    }

    @Override
    public Employee findById(Long id){
        return employeeRepository.findById(id).orElse(null);
    }
}
