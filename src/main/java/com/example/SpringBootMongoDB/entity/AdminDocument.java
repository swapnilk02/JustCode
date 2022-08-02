///**
// * _____________________________*
// * Copyright (C) 2022, JustCode *
// * All rights reserved.			*
// * _____________________________*
// */
//
//package com.example.SpringBootMongoDB.entity;
//
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//import org.springframework.data.annotation.Id;
//import org.springframework.data.mongodb.core.mapping.Document;
//import org.springframework.data.mongodb.core.mapping.Field;
//
//import java.util.List;
//
//@Document(collection = "admin")
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//public class AdminDocument {
//
//    @Id
//    private String id;
//
//    @Field(name = "emp_id")
//    private String empId;
//
//    private String name;
//
//    @Field(name = "email_id")
//    private String emailId;
//
//    private Department department;
//
//    private List<Roles> roles;
//}
