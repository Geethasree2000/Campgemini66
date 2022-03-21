package com.polymorphism;

//pre condition -- you shoud implemennt the inheritance forst
// there should be same method in base and sub class

//this is runtime polymorphism (method overrideing)
class Person {
	public void print() {
		System.out.println("I am  person");
	}
}

class Office extends Person {
	@Override
	// print methodoverride the method form the baase class
	// that person was in office
	public void print() {
		System.out.println("I am working");
	}
}

class Home extends Person {
	@Override
	public void print() {
		System.out.println("I am doing work at home");
	}
}

public class MyPolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person a = new Person();
		a.print();
		System.out.println("at office");
		Person b = new Office();
		b.print();

	}

}
