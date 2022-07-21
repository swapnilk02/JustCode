/**
 * _____________________________*
 * Copyright (C) 2022, JustCode *
 * All rights reserved.			*
 * _____________________________*
 */

package com.example.SpringBootMongoDB.service;

import com.example.SpringBootMongoDB.dto.ProductDTO;

public interface ProductService {

    ProductDTO getProduct(int id);

    ProductDTO createProduct(ProductDTO productDTO);

    void deleteProduct(int id);
}
