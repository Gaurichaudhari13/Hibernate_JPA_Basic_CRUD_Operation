package com.jsp.car;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class CarDelete {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("gauri");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Car car=entityManager.find(Car.class, 2);
		if(car!=null) {
		entityTransaction.begin();
		entityManager.remove(car);
		entityTransaction.commit();
		
		}else {
			System.out.println("not deleted");
			
		}
		
	}

}
