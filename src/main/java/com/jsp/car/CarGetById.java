package com.jsp.car;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CarGetById {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("gauri");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		Car car = entityManager.find(Car.class, 2);

		System.out.println(car.getId());
		System.out.println(car.getName());
		System.out.println(car.getPrice());

	}

}
