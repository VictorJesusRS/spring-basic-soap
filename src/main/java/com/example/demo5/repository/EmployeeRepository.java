package com.example.demo5.repository;

import com.example.demo5.gen.Employee;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class EmployeeRepository {

    private static final Map<String, Employee> employees = new HashMap<>();

    @PostConstruct
    public void initData() {
        // initialize countries map
    }

    public Employee storeEmployee(Employee employee) {
        return employees.put(employee.getDocumentNumber(), employee);
    }
}