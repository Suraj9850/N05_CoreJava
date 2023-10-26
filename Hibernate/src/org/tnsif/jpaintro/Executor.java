package org.tnsif.jpaintro;

import javax.persistence.EntityManager;

public class Executor {
	public static void main(String[] args) {
		EntityManager em=JPAUtil.getEntityManager();
		Product p1=new Product();
		p1.setProductId(101);
		p1.setProductName("Book");
		p1.setQuantity(5);
		p1.setRate(40);
		
		em.getTransaction().begin();
		em.persist(p1);
		em.getTransaction().commit();
	}

}
