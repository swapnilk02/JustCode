/**_______________________________
 * Copyright (C) 2022, JustCode *
 * All rights reserved.			*
 *______________________________*/
package com.example.SpringBootMongoDB.service;

import com.example.SpringBootMongoDB.dto.ProductDTO;
import org.springframework.stereotype.Service;

import com.example.SpringBootMongoDB.entity.ProductEntity;

public interface ProductService {

    ProductDTO getProduct(int id);

    ProductDTO createProduct(ProductDTO productDTO);

}
