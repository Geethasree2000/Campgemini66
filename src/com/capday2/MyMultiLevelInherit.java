package com.capday2;

class A1{
	public void printA1(){
		System.out.println("print A");
	}
}
class B1 extends A1{
	public void printB1(){
		System.out.println("printB");
	}
}
class C extends B1{
	public void printC(){
		System.out.println("print C");
	}
}
public class MyMultiLevelInherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C o = new C();
		o.printA1();
		o.printB1();
		o.printC();
	}

}
