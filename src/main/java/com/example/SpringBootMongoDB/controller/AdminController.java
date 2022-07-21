/**
 * _____________________________*
 * Copyright (C) 2022, JustCode *
 * All rights reserved.			*
 * _____________________________*
 */
package com.example.SpringBootMongoDB.controller;

import com.example.SpringBootMongoDB.dto.AdminDTO;
import com.example.SpringBootMongoDB.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @PostMapping("/create")
    private ResponseEntity<AdminDTO> createAdmin(@RequestBody AdminDTO adminDTO) {
        adminDTO = adminService.createAdmin(adminDTO);
        return ResponseEntity.ok(adminDTO);
    }
}
