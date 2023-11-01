package com.pattern;

import com.pattern.service.EmployeeService;
import com.pattern.service.EmployeeServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        EmployeeService employeeService = appContext.getBean("employeeService", EmployeeServiceImpl.class);

        System.out.println(employeeService.findAll());

    }
}