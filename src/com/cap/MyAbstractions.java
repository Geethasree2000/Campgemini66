package com.cap;

//interface can be defined with or without abstract keyword
//interface provdide 100% abstraction
//

interface Employee{
	//not able to give body of method
	//only declaration is allowed
	public void print();
}
//abstract class will have abstract method and non abstract method
abstract class Parking{
	abstract public void printParking();
	public void printPrice(){
		System.out.println("150");
	}
}
//interface must be implemented by any class
//if this is not implemented there is no use of it

//interface allow us to implement multipple inheritence
class Dept{
	public void printDept(){
		System.out.println("printing the department");
	}
}
//first extending with class dept and then implement employee
class Company extends Dept implements Employee{
	@Override
	public void print(){
		System.out.println("mathod interface example");
	}
}
public class MyAbstractions {

	public MyAbstractions() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		Company c = new Company();
		c.print();
		c.printDept();
	//	c.printPrice();
		//c.printParking();
	}

}
