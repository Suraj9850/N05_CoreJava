package org.tnsif.mvc;
import java.util.*;
public class Executor {

	public static void main(String[] args) throws Exception {
		StudentServiceImpl service=new StudentServiceImpl();
		List<Student> studList;
		
		System.out.println("All student record:");
		studList=service.getAllStudents();
		service.display(studList);
		
		//For record Insert
//		Student st=new Student(104, "Sumit", 80.20f);
//		service.addStudent(st);
		
		float per=75.20f;
		System.out.println("\nStudent marks>"+per+" record:");
		studList=service.getStudentByPer(per);
		service.display(studList);
		
		String name="S%";
		System.out.println("\nStudent Names Start with "+name+" record:");
		studList=service.getStudentNameStartWith(name);
		service.display(studList);
		
//		int no=service.deleteAllStudents();
//		System.out.println(no>=1?no+" record is deleted":"No record is deleted");
		
//		int no=service.deleteByRollNo(104);
//		System.out.println(no==1?no+" record is deleted...":"No student is available...");
		
		//Update All record
//		per=2.2f;
//		int no=service.updateStudent(per);
//		System.out.println(no>=1?no+" record is updated...":"No student is available...");
		
		//Update by roll no
//		per=2.2f;
//		int roll=101;
//		int no=service.updateStudentPerByRollNo(roll,per);
//		System.out.println(no>=1?no+" record is updated...":"No student is available...");
	
		
	}

}
