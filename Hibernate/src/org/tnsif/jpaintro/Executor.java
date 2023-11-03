package org.tnsif.jpaintro;

import java.util.Scanner;

import javax.persistence.EntityManager;

public class Executor{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManager em=JPAUtil.getEntityManager();
//		Product p1=new Product();
//		
//		p1.setProductId(101);
//		p1.setProductName("Book");
//		p1.setQuantity(5);
//		p1.setRate(40);
//		
//		em.getTransaction().begin();
//		em.persist(p1);
//		em.getTransaction().commit();
		
//		JPAUtil.close();
//		
		ProductService service=new ProductService();
		Product p=null;
//		p.setProductId(102);
//		p.setProductName("Pen");
//		p.setQuantity(6);
//		p.setRate(10);
//		
//		service.addProduct(p);
//		Product newProduct=(Product) service.getProduct(102);
//		System.out.println(newProduct);
//		
//		service.deleteProduct(newProduct);
		
		Scanner sc=new Scanner(System.in);
		int ch;
		do
		{
			System.out.println("1.Insert Product");
			System.out.println("2.Update Product");
			System.out.println("3.Delete Product");
			System.out.println("4.Get Product");
			System.out.println("5.Exit");
			System.out.println("Enter your choice:");
			ch=sc.nextInt();
		
			switch (ch) {
			case 1:
				p=new Product();
				System.out.println("Enter product id:");
				int id=sc.nextInt();
				sc.nextLine();
				p.setProductId(id);
				System.out.println("Enter product Name:");
				String pname=sc.nextLine();
				p.setProductName(pname);
				System.out.println("Enter product Cost:");
				float cost=sc.nextFloat();
				p.setRate(cost);
			
				System.out.println("Enter product Quentity:");
				int qty=sc.nextInt();
				
				p.setQuantity(qty);
			
				service.addProduct(p);
				break;
			case 2:
				System.out.println("Enter product id and rate:");
				System.out.println("Enter product id:");
				id=sc.nextInt();
			
				System.out.println("Enter product Cost:");
				cost=sc.nextFloat();
				service.updateProduct(id,cost);
				break;
				
				
			case 3:
				System.out.println("Enter product id:");
				id=sc.nextInt();
			
				service.deleteProduct(id);
				break;
				
			case 4:
				System.out.println("Enter product id:");
				id=sc.nextInt();
				Product newProduct=(Product) service.getProduct(id);
				System.out.println(newProduct);
				break;
			case 5:
				System.out.println("Thanks for use apllication..");
				break;
			default:
				System.out.println("Invalid choice...");
			}
		}while(ch<5);

	}

}