package com.spring.Spring_Core_Crud_Operation_Project.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.Spring_Core_Crud_Operation_Project.configuration.LaptopConfig;
import com.spring.Spring_Core_Crud_Operation_Project.dto.Laptop;
import com.spring.Spring_Core_Crud_Operation_Project.service.LaptopService;

public class LaptopDeleteController {

	public static void main(String[] args) 
	{
        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(LaptopConfig.class);
		
		LaptopService laptopService=(LaptopService) applicationContext.getBean("service");
		
		laptopService.deleteByLaptopId(101);
	}

}
