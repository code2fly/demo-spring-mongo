package com.springstarter.demospringmongo.entity;

import org.springframework.data.annotation.Id;

public class EmployeeRecord {

    @Id
    public String id;

    public String name;
    public int age;
    public String location;

    public EmployeeRecord() {
    }

    public EmployeeRecord( String name, int age, String location) {

        this.name = name;
        this.age = age;
        this.location = location;
    }


    @Override
    public String toString() {
        return "EmployeeRecord{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", location='" + location + '\'' +
                '}';
    }
}
