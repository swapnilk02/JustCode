/**
 * _____________________________*
 * Copyright (C) 2022, JustCode *
 * All rights reserved.			*
 * _____________________________*
 */
package com.example.SpringBootMongoDB.service;

import com.example.SpringBootMongoDB.dto.AdminDTO;

public interface AdminService {

    AdminDTO createAdmin(AdminDTO adminDocument);
}
