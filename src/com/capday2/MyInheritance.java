package com.capday2;

class A{
	
	private String name;
	A(){
		
	}
	A(String name){
		this.name = name;
		System.out.println("calss A"+name);
	}
	public void printA(){
		System.out.println("print a");
	}
}
class B extends A{
	B(){
		super("asa");
	}
	public void printB(){
		System.out.println("print b");
	}
}
public class MyInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B obj = new B();
		obj.printA();
		obj.printB();

	}

}
