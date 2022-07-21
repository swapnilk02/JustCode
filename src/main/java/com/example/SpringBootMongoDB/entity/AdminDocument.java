/**
 * _____________________________*
 * Copyright (C) 2022, JustCode *
 * All rights reserved.			*
 * _____________________________*
 */

package com.example.SpringBootMongoDB.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@Document(collation = "ADMIN")
@Data
public class AdminDocument {

    @Id
    private String id;

    @Field(name = "EMP_ID")
    private String empId;

    private String name;

    @Field(name = "EMAIL_ID")
    private String emailId;

    private Department department;

    private List<Roles> roles;
}
