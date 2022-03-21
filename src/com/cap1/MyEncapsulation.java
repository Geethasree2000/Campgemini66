package com.cap1;

//do not keep data member open 
// any one outside or update or delete the value in variable 
//make the member private
// 
class Students{
	private int rollno;
	private String name;
	private double fees;
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getFees() {
		return fees;
	}
	public void setFees(double fees) {
		this.fees = fees;
	}
	public Students(int rollno, String name, double fees) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.fees = fees;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", fees=" + fees + "]";
	}
	
}
public class MyEncapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students s = new Students(101,"JNJ",32.54);
		System.out.println(s.toString());
	}

}
