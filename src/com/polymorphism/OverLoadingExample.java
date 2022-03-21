package com.polymorphism;

class Car {
	public void print(String color) {
		System.out.println("the car color is " + color);
	}

	public void print(String color, String brand) {
		System.out.println("The car color is " + color + " and the brand of the car is " + brand);
	}

	public void print(String color, String brand, double price) {
		System.out.println(
				"The car color is " + color + " and the brand of the car is " + brand + "the price is " + price);
	}
}

public class OverLoadingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c = new Car();
		c.print("Red");
		c.print("Blue", "Benz");
		c.print("black", "audi", 7000000.00);
	}

}
