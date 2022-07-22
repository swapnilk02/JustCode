/**
 * _____________________________*
 * Copyright (C) 2022, JustCode *
 * All rights reserved.			*
 * _____________________________*
 */
package com.example.SpringBootMongoDB.controller;

import com.example.SpringBootMongoDB.entity.AdminDocument;
import com.example.SpringBootMongoDB.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @PostMapping("/create")
    private ResponseEntity<AdminDocument> createAdmin(@RequestBody AdminDocument adminDocument) {
        adminDocument = adminService.createAdmin(adminDocument);
        return ResponseEntity.ok(adminDocument);
    }

    @PutMapping("/update")
    private ResponseEntity<AdminDocument> updateAdmin(@RequestBody AdminDocument adminDocument) {
        //existing create method will do the update as well
        adminDocument = adminService.createAdmin(adminDocument);
        return ResponseEntity.ok(adminDocument);
    }

    @GetMapping("/getById/{id}")
    private ResponseEntity<AdminDocument> getAdminDocumentById(@PathVariable String id) {
        AdminDocument adminDocument = adminService.getAdminDocumentById(id);
        return ResponseEntity.ok(adminDocument);
    }

    @GetMapping("/getAll")
    private ResponseEntity<List<AdminDocument>> getAllAdminDocument() {
        List<AdminDocument> adminDocuments = adminService.getAllAdminDocument();
        return ResponseEntity.ok(adminDocuments);
    }

    @GetMapping("/getByName/{name}")
    private ResponseEntity<List<AdminDocument>> getAdminDocumentByName(@PathVariable String name) {
        List<AdminDocument> adminDocuments = adminService.findAdminDocumentByName(name);
        return ResponseEntity.ok(adminDocuments);
    }

    @GetMapping("/getByNameAndMailId/name/{name}/email/{emailId}")
    private ResponseEntity<List<AdminDocument>> getAdminDocumentByNameAndMailId(@PathVariable String name,
                                                                                @PathVariable String emailId) {
        List<AdminDocument> adminDocuments = adminService.findAdminDocumentByNameAndMailId(name, emailId);
        return ResponseEntity.ok(adminDocuments);
    }

    @GetMapping("/getByNameOrMailId/name/{name}/email/{emailId}")
    private ResponseEntity<List<AdminDocument>> getAdminDocumentByNameOrMailId(@PathVariable String name,
                                                                               @PathVariable String emailId) {
        List<AdminDocument> adminDocuments = adminService.findAdminDocumentByNameOrMailId(name, emailId);
        return ResponseEntity.ok(adminDocuments);
    }


    @GetMapping("/getByPageNumber/page/{pageNumber}/pageSize/{pageSize}")
    private ResponseEntity<List<AdminDocument>> getAdminDocumentByPageNumberAndPageSize(@PathVariable int pageNumber,
                                                                                        @PathVariable int pageSize) {
        List<AdminDocument> adminDocuments = adminService.findByPageNumberAndSize(pageNumber, pageSize);
        return ResponseEntity.ok(adminDocuments);
    }

    @GetMapping("/getByDepartmentName/{departmentName}")
    private ResponseEntity<List<AdminDocument>> getAdminDocumentByDepartmentName(@PathVariable String departmentName) {
        List<AdminDocument> adminDocuments = adminService.findByDepartmentName(departmentName);
        return ResponseEntity.ok(adminDocuments);
    }

    @GetMapping("/getSorted/}")
    private ResponseEntity<List<AdminDocument>> getAdminDocumentByDepartmentName(@PathVariable String departmentName) {
        List<AdminDocument> adminDocuments = adminService.findByDepartmentName(departmentName);
        return ResponseEntity.ok(adminDocuments);
    }


    @DeleteMapping("/deleteById/{id}")
    private ResponseEntity<String> deleteAdminDocumentById(@PathVariable String id) {
        adminService.deleteAdminDocumentById(id);
        return ResponseEntity.ok("Record Successfully Deleted");
    }
}