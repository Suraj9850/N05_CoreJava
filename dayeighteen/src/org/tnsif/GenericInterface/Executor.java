package org.tnsif.GenericInterface;

public class Executor {

	public static void main(String[] args) {
		String name[]= {"Abc","Xyz","Pqr"};
		Integer no[]= {1,8,3,4,5,9,7};
		
		MinMaxImplement<Integer> intObj=new MinMaxImplement<Integer>(no);
		System.out.println("Minimum of Int array is : "+intObj.getMinimum());
		System.out.println("Maximum of Int array is : "+intObj.getMaximum());
		
		MinMaxImplement<String> strObj=new MinMaxImplement<String>(name);
		System.out.println("Minimum of Int array is : "+strObj.getMinimum());
		System.out.println("Maximum of Int array is : "+strObj.getMaximum());
		
	}

}
