package com.springstarter.demospringmongo.repository;

import com.springstarter.demospringmongo.entity.EmployeeRecord;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface  EmployeeRepository extends MongoRepository<EmployeeRecord, String> {

    public List<EmployeeRecord> findAll();

}
