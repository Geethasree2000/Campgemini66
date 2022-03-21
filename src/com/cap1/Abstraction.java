package com.cap1;

interface Student{
	public void print();
}

class Tv implements Student{

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("The student hacve LED tv");
		
	}
	
}
class Laptop implements Student{

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("The student has Dell laptop");
		
	}
	
}
class Moblie implements Student{
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("The student has Oppo");
		
	}
	
}
abstract class Car implements Student{
	abstract void brand();
}
class Tata extends Car{

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("The student has car");
		
	}

	@Override
	void brand() {
		// TODO Auto-generated method stub
		System.out.println("The brand is Tata");
		
	}
	
}
public class Abstraction {
	public static void main(String[] args) {
		Moblie m = new Moblie();
		m.print();
		Laptop l = new Laptop();
		l.print();
		Tv t = new Tv();
		t.print();
		Tata ta = new Tata();
		ta.print();
		ta.brand();
	}
}
