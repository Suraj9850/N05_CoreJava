package org.tnsif.stream;

public class Student {
	 private int rollNo;
	 private String studName;
	 private float per;
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", studName=" + studName + ", per=" + per + "]";
	}
	public Student(int rollNo, String studName, float per) {
		super();
		this.rollNo = rollNo;
		this.studName = studName;
		this.per = per;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getStudName() {
		return studName;
	}
	public void setStudName(String studName) {
		this.studName = studName;
	}
	public float getPer() {
		return per;
	}
	public void setPer(float per) {
		this.per = per;
	} 
}
