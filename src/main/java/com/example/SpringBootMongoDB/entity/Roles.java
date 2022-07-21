/**
 * _____________________________*
 * Copyright (C) 2022, JustCode *
 * All rights reserved.			*
 * _____________________________*
 */
package com.example.SpringBootMongoDB.entity;

import org.springframework.data.mongodb.core.mapping.Field;

public class Roles {

    private String id;

    @Field(name = "ROLE_NAME")
    private String roleName;
}
