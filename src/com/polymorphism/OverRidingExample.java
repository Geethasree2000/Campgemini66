package com.polymorphism;

class Child {
	public void print() {
		System.out.println("I am Raj");
	}
}

class School extends Child {
	@Override
	public void print() {
		System.out.println("I am a Student");
	}
}

class Home1 extends Child {
	@Override
	public void print() {
		System.out.println("I am the only child of my parents");
	}
}

public class OverRidingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c = new Child();
		c.print();
		Child c1 = new School();
		c1.print();
		Child c2 = new Home1();
		c2.print();

	}

}
