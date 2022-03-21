package com.cap;

abstract class BaseClass{
	abstract public void show1();
	public void show2(){
		System.out.println("show2 of parent");
	}
}
class ChildClass extends BaseClass{

	@Override
	public void show1() {
		// TODO Auto-generated method stub
		System.out.println("show1");
		
	}
	public void show2(){
		System.out.println("show2 concrete of parent class");
	}
	
}

public class AbstractionPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildClass c = new ChildClass();
		c.show1();
		c.show2();
		
	}

}
