package com.example.SpringBootMongoDB.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@AllArgsConstructor
public class Department {

    private String id;

    @Field(name = "department_Name")
    private String deptName;
}
