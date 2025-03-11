package com.paginationExample.controller;

import com.paginationExample.entity.Employee;
import com.paginationExample.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @RequestMapping("/employees")
    public List<Employee> getAllEmployees(@RequestParam(name = "pageNo",required = false,defaultValue = "0") int pageNo,
                                          @RequestParam(name = "pageSize",required = false,defaultValue ="0") int pageSize,
                                          @RequestParam(name = "sortBy",required = false,defaultValue = "id") String sortBy) {
        // Simulating fetching all employees from a database
        return employeeService.getAllEmployees(pageNo, pageSize, sortBy);
    }

    @RequestMapping("/save")
    public List<Employee> saveAllEmployees(@RequestBody List<Employee> employees) {
        // Simulating fetching all employees from a database
        return employeeService.saveAllEmployees(employees);
    }
}
