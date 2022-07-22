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

import java.util.List;

@Repository
public interface AdminRepository extends MongoRepository<AdminDocument, String> {

    List<AdminDocument> findByName(String name);

    List<AdminDocument> findByNameAndEmailId(String name, String emailId);

    List<AdminDocument> findByNameOrEmailId(String name, String emailId);

    List<AdminDocument> findByDepartmentDeptName(String deptName);

    List<AdminDocument> findByEmailIdIsLike(String emailId);

    List<AdminDocument> findByNameStartsWith(String name);
}
