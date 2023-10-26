package org.tnsif.inheretance;

import javax.persistence.EntityManager;

import org.tnsif.jpaintro.JPAUtil;

public class Executor {
  public static void main(String args[])
  {
	  EntityManager em=JPAUtil.getEntityManager();
	  Person p=new Person();
	  p.setId(101);
	  p.setName("Ram");
	  
	  em.getTransaction().begin();
	  em.persist(p);
	  em.getTransaction().commit();
	  
	  Employee e=new Employee();
	  e.setId(102);
	  e.setName("Pooja");
	  e.setSalary(32000);
	  
	  em.getTransaction().begin();
	  em.persist(e);
	  em.getTransaction().commit();
	  
  }
}
