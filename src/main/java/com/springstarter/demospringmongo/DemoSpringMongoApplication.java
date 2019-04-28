package com.springstarter.demospringmongo;

import com.springstarter.demospringmongo.entity.EmployeeRecord;
import com.springstarter.demospringmongo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoSpringMongoApplication implements CommandLineRunner {

    @Autowired
    private EmployeeRepository employeeRepository;

	public static void main(String[] args) {
		SpringApplication.run(DemoSpringMongoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	    employeeRepository.deleteAll();

	    // adding couple of values
        employeeRepository.save(new EmployeeRecord("Bhavya", 27, "USA"));
        employeeRepository.save(new EmployeeRecord("Chinese ladki", 25, "Bhavya's LAP"));

        System.out.println("Show all employees");
        for ( EmployeeRecord employeeRecord: employeeRepository.findAll()
             ) {
            System.out.println(employeeRecord);
        }
	}
}
