package org.tnsif.inheretance;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Emp")
public class Employee extends Person{
     private float Salary;
     
   
	@Override
	public String toString() {
		return "Employee [Salary=" + Salary + ", getId()=" + getId() + ", getName()=" + getName() + "]";
	}
	public float getSalary() {
		return Salary;
	}
	public void setSalary(float salary) {
		Salary = salary;
	}
     
     
}
