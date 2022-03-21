package com.cap;

interface Car{
	public void color();
	public void price();
}


class Tata implements Car {

	@Override
	public void color() {
		// TODO Auto-generated method stub
		System.out.println("color of tata is black");
		
	}

	@Override
	public void price() {
		// TODO Auto-generated method stub
		System.out.println("price of tata is 5L");
		
	}

}
abstract class RollsRoyce implements Car{
	abstract void brand();
	@Override
	public void color() {
		// TODO Auto-generated method stub
		System.out.println("color is purple");
		
	}

	@Override
	public void price() {
		// TODO Auto-generated method stub
		System.out.println("price is 10C");
		
	}
	
}
class Phantom extends RollsRoyce{

	@Override
	void brand() {
		// TODO Auto-generated method stub
		System.out.println("Rolls Royce Phantom");
	}
}
public class AbstractDemo {
	public static void main(String[] args){
		Tata t = new Tata();
		t.color();
		t.price();
		
		Phantom p = new Phantom();
		p.brand();
		p.color();
		p.price();
		
	}

}
