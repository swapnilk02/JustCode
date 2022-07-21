/**
 * _____________________________*
 * Copyright (C) 2022, JustCode *
 * All rights reserved.			*
 * _____________________________*
 */
package com.example.SpringBootMongoDB.mapper;

import com.example.SpringBootMongoDB.dto.ProductDTO;
import com.example.SpringBootMongoDB.entity.ProductEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductMapper {

    ProductEntity toEntity(ProductDTO productDTO);

    ProductDTO toDto(ProductEntity productEntity);

}
