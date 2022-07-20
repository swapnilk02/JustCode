/**_______________________________
 * Copyright (C) 2022, JustCode *
 * All rights reserved.			*
 *______________________________*/

package com.example.SpringBootMongoDB.controller;

import com.example.SpringBootMongoDB.dto.ProductDTO;
import com.example.SpringBootMongoDB.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/get/{id}")
    private ResponseEntity<ProductDTO> getProduct(@PathVariable("id") int id) {
        ProductDTO productDTO = productService.getProduct(id);
        return ResponseEntity.ok(productDTO);
    }

    @PostMapping("/create")
    private ResponseEntity<ProductDTO> createProduct(@RequestBody ProductDTO productDTO){
        ProductDTO productDTOSved = productService.createProduct(productDTO);
        return ResponseEntity.ok(productDTO);
    }
}
