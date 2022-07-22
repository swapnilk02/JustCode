/**
 * _____________________________*
 * Copyright (C) 2022, JustCode *
 * All rights reserved.			*
 * _____________________________*
 */
package com.example.SpringBootMongoDB.service;

import com.example.SpringBootMongoDB.entity.AdminDocument;

import java.util.List;

public interface AdminService {

    AdminDocument createAdmin(AdminDocument adminDocument);

    AdminDocument getAdminDocumentById(String id);

    List<AdminDocument> getAllAdminDocument();

    void deleteAdminDocumentById(String id);

    List<AdminDocument> findAdminDocumentByName(String name);

    List<AdminDocument> findAdminDocumentByNameAndMailId(String name, String emailId);

    List<AdminDocument> findAdminDocumentByNameOrMailId(String name, String emailId);
    List<AdminDocument> findByPageNumberAndSize(int pageNumber, int pageSize);

    List<AdminDocument> findByDepartmentName(String name);
}
