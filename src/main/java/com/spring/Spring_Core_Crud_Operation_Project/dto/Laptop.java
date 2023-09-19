package com.spring.Spring_Core_Crud_Operation_Project.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Entity
@Component(value = "laptop")
public class Laptop 
{
	@Id
   private int laptopId;
   private String laptopName;
   private double laptopPrice;
public int getLaptopId() {
	return laptopId;
}
public void setLaptopId(int laptopId) {
	this.laptopId = laptopId;
}
public String getLaptopName() {
	return laptopName;
}
public void setLaptopName(String laptopName) {
	this.laptopName = laptopName;
}
public double getLaptopPrice() {
	return laptopPrice;
}
public void setLaptopPrice(double laptopPrice) {
	this.laptopPrice = laptopPrice;
}
   
}
