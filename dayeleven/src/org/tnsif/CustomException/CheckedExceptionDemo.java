package org.tnsif.CustomException;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
//program to demonstrate checked exception
public class CheckedExceptionDemo {

	public static void main(String[] args) {
		try {
			
			FileInputStream fp=new FileInputStream("C:\\Users\\NEHA\\eclipse-workspace\\dayeleven\\src\\org\\tnsif\\CustomException\\demo.txt");
			System.out.println("File found:"+fp);
		} catch (FileNotFoundException e) {
			System.out.println("File is not found:"+e);
		}

	}

}
