package com.jsp.employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class EmployeeDriver {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("gauri");//to get connection
		EntityManager entityManager = entityManagerFactory.createEntityManager();//for CRUD operation
		//methods for DB operation
		EntityTransaction entityTransaction = entityManager.getTransaction();//for change(update,delete,insert)
		
		
		Employee employee=new Employee();
		//hibernate will generate set id
		employee.setName("mno");
		employee.setEmail("mno@mail.com");
		employee.setCno(965210352l);
		entityTransaction.begin();
		entityManager.persist(employee);
		entityTransaction.commit();
	}

}
