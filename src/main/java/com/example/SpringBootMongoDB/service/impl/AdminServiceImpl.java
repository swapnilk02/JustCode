/**
 * _____________________________*
 * Copyright (C) 2022, JustCode *
 * All rights reserved.			*
 * _____________________________*
 */
package com.example.SpringBootMongoDB.service.impl;

import com.example.SpringBootMongoDB.entity.AdminDocument;
import com.example.SpringBootMongoDB.mapper.AdminMapper;
import com.example.SpringBootMongoDB.mongoRepository.AdminRepository;
import com.example.SpringBootMongoDB.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminRepository adminRepository;

    @Autowired
    private AdminMapper adminMapper;

    @Override
    public AdminDocument createAdmin(AdminDocument adminDocument) {
        return adminRepository.save(adminDocument);
    }

    @Override
    public AdminDocument getAdminDocumentById(String id) {
        return adminRepository.findById(id).get();
    }

    @Override
    public List<AdminDocument> getAllAdminDocument() {
        return adminRepository.findAll();
    }

    @Override
    public void deleteAdminDocumentById(String id) {
        adminRepository.deleteById(id);
    }

    @Override
    public List<AdminDocument> findAdminDocumentByName(String name) {
        return adminRepository.findByName(name);
    }

    @Override
    public List<AdminDocument> findAdminDocumentByNameAndMailId(String name, String emailId) {
        return adminRepository.findByNameAndEmailId(name, emailId);
    }

    @Override
    public List<AdminDocument> findAdminDocumentByNameOrMailId(String name, String emailId) {
        return adminRepository.findByNameOrEmailId(name, emailId);
    }

    @Override
    public List<AdminDocument> findByPageNumberAndSize(int pageNumber, int pageSize) {
        Pageable pageable = PageRequest.of(pageNumber - 1, pageSize);
        return adminRepository.findAll(pageable).getContent();
    }

    @Override
    public List<AdminDocument> findByDepartmentName(String name) {
        return adminRepository.findByDepartmentDeptName(name);
    }
}
