package com.capday2;

class Employee1{
	public void printEmployee1(){
		System.out.println("he is an employee");
	}
}
class Parent2 extends Employee1{
	public void printParent(){
		System.out.println("he is also the parent of the child");
	}
}
class GrandChild extends Employee1{
	public void printGchild(){
		System.out.println("he is alsoo the grand child of his graand parents");
	}
}
public class HierarchicalInhertiExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent2 p = new Parent2();
		p.printEmployee1();
		p.printParent();
		
		GrandChild g = new GrandChild();
		g.printEmployee1();
		g.printGchild();
	}

}
