package com.springstarter.demospringmongo.controller;

import com.springstarter.demospringmongo.entity.EmployeeRecord;
import com.springstarter.demospringmongo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @RequestMapping(method = RequestMethod.GET, path = "/employees")
    public List<EmployeeRecord> getEmployees() {
        List<EmployeeRecord> employeeRecordsInDb = employeeRepository.findAll();

        return employeeRecordsInDb;
    }

}
