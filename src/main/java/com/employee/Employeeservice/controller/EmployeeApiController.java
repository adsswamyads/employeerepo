package com.employee.Employeeservice.controller;

import com.employee.Employeeservice.entity.Employee;
import com.employee.Employeeservice.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeApiController {
    @Autowired
    private EmployeeService employeeService;
    @RequestMapping("/createemployees")
    public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee){
      return new ResponseEntity<>(employeeService.createEmployee(employee), HttpStatus.CREATED);
    }
}
