/**_______________________________
 * Copyright (C) 2022, JustCode *
 * All rights reserved.			*
 *______________________________*/

package com.example.SpringBootMongoDB.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class ProductDTO {

	private int id;
	private String name;
	private int quantity;
	private double price;



}
