package com.cap1;

interface Student1{
	void prntFeature();
}

abstract class Mobile implements Student1{
	abstract public void printBrand();
}
class MoblieBrand extends Mobile{

	@Override
	public void prntFeature() {
		// TODO Auto-generated method stub
		System.out.println("Android");
		
	}

	@Override
	public void printBrand() {
		// TODO Auto-generated method stub
		System.out.println("Sammsung");
	}
	
}

abstract class Laptop1 implements Student1{
	abstract public void printBrand();
}

class LaptopBrand extends Laptop1{

	@Override
	public void prntFeature() {
		// TODO Auto-generated method stub
		System.out.println("MAC OS");
		
	}

	@Override
	public void printBrand() {
		// TODO Auto-generated method stub
		System.out.println("Apple laptop");
	}
	
}
abstract class Car1 implements Student1{
	abstract public void printBrand();
}

class CarBrand extends Car1{

	@Override
	public void prntFeature() {
		// TODO Auto-generated method stub
		System.out.println("Self driving");
		
	}

	@Override
	public void printBrand() {
		// TODO Auto-generated method stub
		System.out.println("Tesla");
	}
	
}
public class MyAbstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("The student has the following things:");
		CarBrand c = new CarBrand();
		c.printBrand();
		c.prntFeature();
		System.out.println("--------------");
		LaptopBrand l = new LaptopBrand();
		l.printBrand();
		l.prntFeature();
		System.out.println("--------------");
		MoblieBrand m = new MoblieBrand();
		m.printBrand();
		m.prntFeature();
	}

}
