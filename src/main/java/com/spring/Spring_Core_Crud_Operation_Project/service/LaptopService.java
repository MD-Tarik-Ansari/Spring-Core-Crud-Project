package com.spring.Spring_Core_Crud_Operation_Project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.Spring_Core_Crud_Operation_Project.dao.LaptopDao;
import com.spring.Spring_Core_Crud_Operation_Project.dto.Laptop;
@Service(value = "service")
public class LaptopService 
{
	@Autowired
    private LaptopDao laptopDao;
    
	/*
	 * service class save method
	 * */
	
    public Laptop saveLaptop(Laptop laptop)
    {
    	return laptopDao.saveLaptop(laptop);
    }
    
    
    public List<Laptop> displayAllLaptop()
    {
    	return laptopDao.displayAllLaptop();
    }
    
    
    public void deleteByLaptopId(int laptopId)
    {
        Laptop laptop=laptopDao.getByLaptopId(laptopId);
        if(laptop!=null)
        {
        	laptopDao.deleteByLaptopId(laptopId);
        }
        else {
			System.out.println("Id is not found ");
		}
    }
    
    
    public void updateLaptop(int laptopId,String laptopName)
    {
    	Laptop laptop=laptopDao.getByLaptopId(laptopId);
    	if(laptop!=null)
    	{
    		laptopDao.updateLaptop(laptopId, laptopName);
    	}
    	else {
			System.out.println("LaptopId is not persent ");
		}
    }
}
