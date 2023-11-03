package org.tnsif.inheretance;

import javax.persistence.EntityManager;

import org.tnsif.jpaintro.JPAUtil;

public class Executor {
  public static void main(String args[])
  {
	  EntityManager em1=JPAUtil.getEntityManager();
	  Person p=new Person();
	  p.setPersonId(103);
	  p.setName("Mohit");
	  
	  em1.getTransaction().begin();
	  em1.persist(p);
	  em1.getTransaction().commit();
	  
	  Employee e=new Employee();
	  e.setPersonId(102);
	  e.setName("Pooja");
	  e.setSalary(32000);
	  
	  em1.getTransaction().begin();
	  em1.persist(e);
	  em1.getTransaction().commit();
	  
  }
}
