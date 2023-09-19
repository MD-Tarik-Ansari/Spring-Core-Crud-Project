package com.spring.Spring_Core_Crud_Operation_Project.controller;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.Spring_Core_Crud_Operation_Project.configuration.LaptopConfig;
import com.spring.Spring_Core_Crud_Operation_Project.dto.Laptop;
import com.spring.Spring_Core_Crud_Operation_Project.service.LaptopService;

public class LaptopDisplayController {

	public static void main(String[] args) 
	{
        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(LaptopConfig.class);
		
		LaptopService laptopService=(LaptopService) applicationContext.getBean("service");
		
		List<Laptop> laptops=laptopService.displayAllLaptop();
		
		for (Laptop laptop : laptops) {
			System.out.println("LaptopId is : "+laptop.getLaptopId());
			System.out.println("LaptopName is : "+laptop.getLaptopName());
			System.out.println("LaptopPrice is : "+laptop.getLaptopPrice());
			System.out.println("========================");
		}
	}

}
