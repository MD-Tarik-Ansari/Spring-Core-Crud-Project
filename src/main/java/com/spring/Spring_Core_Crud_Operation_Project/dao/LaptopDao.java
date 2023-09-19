package com.spring.Spring_Core_Crud_Operation_Project.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.stereotype.Repository;

import com.spring.Spring_Core_Crud_Operation_Project.dto.Laptop;
@Repository
public class LaptopDao 
{
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("ansari");
	
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	/* 
	 * save method 
	 * */
	public Laptop saveLaptop(Laptop laptop)
	{
		entityTransaction.begin();
		entityManager.persist(laptop);
		System.out.println("Data is inserted ");
		entityTransaction.commit();
		
		return laptop;
	}
	
	/*
	 * getById method 
	 */
	
	public Laptop getByLaptopId(int laptopId)
	{
		return entityManager.find(Laptop.class, laptopId);
	}
	
	
	/*
	 *  display 
      */
	
	public List<Laptop> displayAllLaptop()
	{
		String displayQuery="select S from Laptop S";
		
		return entityManager.createQuery(displayQuery,Laptop.class).getResultList();
	}
	
	
	/*
	 * 
	 *  delete 
	 */
	
	public void deleteByLaptopId(int laptopId)
	{
		Laptop laptop=getByLaptopId(laptopId);
		if(laptop!=null)
		{
			entityTransaction.begin();
			entityManager.remove(laptop);
			System.out.println("Data is deleted");
			entityTransaction.commit();
		}
	}
	
	
	/*
	 * 
	 *  Update
	 */
	
	
	public void updateLaptop(int laptopId,String laptopName)
	{
		Laptop laptop=getByLaptopId(laptopId);
		if(laptop!=null)
		{
			laptop.setLaptopName(laptopName);
			entityTransaction.begin();
			entityManager.merge(laptop);
			System.out.println("Data is updated ");
			entityTransaction.commit();
		}
	}
}
