package com.example.SpringBootMongoDB.entity;

import org.springframework.data.mongodb.core.mapping.Field;

public class Department {

    private String id;

    @Field(name = "DEPARTMENT_NAME")
    private String deptName;
}
