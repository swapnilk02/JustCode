/**
 * _____________________________*
 * Copyright (C) 2022, JustCode *
 * All rights reserved.			*
 * _____________________________*
 */
package com.example.SpringBootMongoDB.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AdminDTO {

    private String id;

    private String empId;

    private String name;

    private String emailId;

    private DepartmentDTO departmentDTO;

    private List<RolesDTO> rolesDTOS;

}
