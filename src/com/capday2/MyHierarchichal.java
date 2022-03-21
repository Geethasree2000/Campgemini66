package com.capday2;

class Parent{
	public void printSuper(){
		System.out.println("print parent");
	}
}
class Child1 extends Parent{
	public void printChild1(){
		System.out.println("print child1");
	}
}
class Child2 extends Parent{
	public void printChild2(){
		System.out.println("print child2");
	}
}
public class MyHierarchichal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child1 c1 = new Child1();
		c1.printChild1();
		c1.printSuper();
		
		Child2 c2 = new Child2();
		c2.printChild2();
		c2.printSuper();
	}

}
