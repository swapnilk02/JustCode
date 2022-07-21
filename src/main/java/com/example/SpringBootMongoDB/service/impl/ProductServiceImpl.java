/**
 * _____________________________*
 * Copyright (C) 2022, JustCode *
 * All rights reserved.			*
 * _____________________________*
 */


package com.example.SpringBootMongoDB.service.impl;

import com.example.SpringBootMongoDB.JPARepository.ProductRepository;
import com.example.SpringBootMongoDB.dto.ProductDTO;
import com.example.SpringBootMongoDB.entity.ProductEntity;
import com.example.SpringBootMongoDB.mapper.ProductMapper;
import com.example.SpringBootMongoDB.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private ProductMapper productMapper;

    @Override
    public ProductDTO getProduct(int id) {
        ProductEntity productEntity = productRepository.findById(id).orElse(null);
        return productMapper.toDto(productEntity);
    }

    @Override
    public ProductDTO createProduct(ProductDTO productDTO) {
        ProductEntity productEntity = productMapper.toEntity(productDTO);
        ProductEntity productEntitySaved = productRepository.save(productEntity);
        return productMapper.toDto(productEntitySaved);
    }

    @Override
    public void deleteProduct(int id) {
        ProductEntity productEntity = productRepository.findById(id).orElse(null);
        productRepository.delete(productEntity);
    }

}
