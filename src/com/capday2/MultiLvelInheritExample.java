package com.capday2;

class Transport{
	public void print(){
		System.out.println("transport types");
	}
}
class Car extends Transport{
	public void  printCar(){
		System.out.println("car");
	}
}
class Tata extends Car{
	public void printBrand(){
		System.out.println("the brand is tata");
	}
}

public class MultiLvelInheritExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tata t = new Tata();
		t.print();
		t.printCar();
		t.printBrand();

	}

}
