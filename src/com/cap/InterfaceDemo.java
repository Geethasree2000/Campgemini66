package com.cap;

interface Toy{
	public void price();
}
class Bike implements Toy{

	@Override
	public void price() {
		// TODO Auto-generated method stub
		System.out.println("50");
	}
	
}
public class InterfaceDemo {

	public static void main(String[] args) {
		Bike b = new Bike();
		b.price();
		
	}

}
