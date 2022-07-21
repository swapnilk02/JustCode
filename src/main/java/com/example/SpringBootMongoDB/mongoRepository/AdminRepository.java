/**
 * _____________________________*
 * Copyright (C) 2022, JustCode *
 * All rights reserved.			*
 * _____________________________*
 */
package com.example.SpringBootMongoDB.mongoRepository;

import com.example.SpringBootMongoDB.entity.AdminDocument;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends MongoRepository<AdminDocument, String> {
}
