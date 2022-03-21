package com.capday2;

class Mouse{
	public void disp(){
		System.out.println("this is my mouse");
	}
}
class Student{
	private int rollno;
	private String name;
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
	public Student(int rollno, String name) {
		super();
		this.rollno = rollno;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + "]";
	}
	
}
class Pen{
	public void brand(){
		System.out.println("my pen brand is hauser");
	}
}
public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mouse m = new Mouse();
		m.disp();
		Student s = new Student(1,"dev");
		System.out.println(s.toString());
		Pen p = new Pen();
		p.brand();
	}

}
