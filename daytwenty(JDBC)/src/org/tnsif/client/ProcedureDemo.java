package	org.tnsif.client;

import java.sql.SQLException;

import org.tnsif.service.ProcedureService;

public class ProcedureDemo {

	public static void main(String[] args){
		int n;
		try {
			ProcedureService service=new ProcedureService();
//			n=service.updateSalary();
//			System.out.println(n>0?n+" employee(s) salaray incremented":"No record(s) available");
			//n=service.deleteStudent(72);
			//System.out.println(n>0?n+" student(s) deleted":"No record(s) available");
			
			String name=service.getStudentName(102);
			System.out.println(name);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
