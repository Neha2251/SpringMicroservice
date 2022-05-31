package com.product;

import javax.persistence.Entity;

@Entity
public class ProductVO {
	
	String name;
	String bigImage;
	String thumbnail;
	String description;
	String shortdescription;
	int ratings;
	float price;
	boolean isActive;

}
