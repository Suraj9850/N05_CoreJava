package org.tnsif.jpaintro;

import java.util.List;

import javax.persistence.EntityManager;

public class ProductService {
	EntityManager em;
	public ProductService() {
		// TODO Auto-generated constructor stub
		em=JPAUtil.getEntityManager();
	}
	public void addProduct(Product product)
	{
		em.getTransaction().begin();
		em.persist(product);
		em.getTransaction().commit();
	}
	public Product getProduct(int productId)
	{
		return (Product) em.find(Product.class, productId);
	}
	public List<Product> getAllProduct()
	{
		List<Product> productList=null;
		return productList;
	}
	public void updateProduct(int productId,float cost)
	{
		Product existProduct=(Product) getProduct(productId);
		if(existProduct==null)
			System.out.println("No product available for deletion");
		else
		{
			existProduct.setRate(cost);
			em.getTransaction().begin();
			em.merge(existProduct);
			em.getTransaction().commit();
		}
	}
	public void deleteProduct(int productId)
	{
		Product existProduct=(Product) getProduct(productId);
		if(existProduct==null)
			System.out.println("No product available for deletion");
		else
		{
			em.getTransaction().begin();
			em.remove(existProduct);
			em.getTransaction().commit();
		}
	}
}