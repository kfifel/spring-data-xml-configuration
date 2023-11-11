package com.pattern;

import com.pattern.entities.Employee;
import com.pattern.service.EmployeeService;
import com.pattern.service.EmployeeServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.awt.*;
import java.awt.color.ColorSpace;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        EmployeeService employeeService = appContext.getBean("employeeService", EmployeeServiceImpl.class);
        Employee employee;
        try{
            employee = employeeService.save(new Employee("kfifel"));
            System.out.println(ColorSpace.TYPE_2CLR + "SUCCESS: " + employee + Color.WHITE);
        }catch (IllegalArgumentException e) {
            System.out.println(Color.RED + "ERROR: " + e.getMessage() + Color.WHITE);
        }

        System.out.println(employeeService.findAll());

    }
}