/**_______________________________
 * Copyright (C) 2022, JustCode *
 * All rights reserved.			*
 *______________________________*/

package com.example.SpringBootMongoDB.entity;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="PRODUCT")
public class ProductEntity {
	
	@Id
	@GeneratedValue
	private int id;
	
	private String name;
	private int quantity;
	private double price;
	

}
