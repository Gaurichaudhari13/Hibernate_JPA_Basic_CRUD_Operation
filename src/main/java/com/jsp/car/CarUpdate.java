package com.jsp.car;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class CarUpdate {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("gauri");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Car car =entityManager.find(Car.class,1);
		car.setName("xyz");
		car.setPrice(2000);
		
		entityTransaction.begin();
		entityManager.merge(car);
		entityTransaction.commit();
		System.out.println(car.getId()+"updated");
		

	}

}
