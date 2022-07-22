/**
 * _____________________________*
 * Copyright (C) 2022, JustCode *
 * All rights reserved.			*
 * _____________________________*
 */
package com.example.SpringBootMongoDB.mapper;

import com.example.SpringBootMongoDB.dto.AdminDTO;
import com.example.SpringBootMongoDB.dto.DepartmentDTO;
import com.example.SpringBootMongoDB.entity.AdminDocument;
import com.example.SpringBootMongoDB.entity.Department;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AdminMapper {

    AdminDocument toAdminDocument(AdminDTO adminDTO);

    AdminDTO toAdminDTO(AdminDocument adminDocument);

    DepartmentDTO toDepartmentDTO(Department department);

    Department toDepartment(DepartmentDTO departmentDTO);
}
