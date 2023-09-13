package com.jsp.car;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;


public class CarGetAll {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("gauri");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		String sql="SELECT c FROM Car c";
		Query query=entityManager.createQuery(sql);
		List <Car> car=query.getResultList();
		for (Car c:car) {
			
			System.out.println("================");
			System.out.println(c.getId());
			System.out.println(c.getName());
			System.out.println(c.getPrice());
			System.out.println("============");
		
	}

}
}
