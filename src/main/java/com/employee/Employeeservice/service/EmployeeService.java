package com.employee.Employeeservice.service;

import com.employee.Employeeservice.entity.Employee;
import com.employee.Employeeservice.model.EmployeeResponse;
import com.employee.Employeeservice.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee createEmployee(Employee employee)
    {
        return employeeRepository.save(employee);
    }
}
