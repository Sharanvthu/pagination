package com.paginationExample.service;

import com.paginationExample.entity.Employee;
import com.paginationExample.entity.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired

    private EmployeeRepository employeeRepository;


    public List<Employee> saveAllEmployees(List<Employee> employees) {
        return employeeRepository.saveAll(employees);
    }


    public List<Employee> getAllEmployees(int pageNo, int pageSize, String sortBy) {
        Sort sort = Sort.by(sortBy);
        Pageable pageable= PageRequest.of(pageNo, pageSize, sort);
        return employeeRepository.findAll(pageable).getContent();
    }
}
