package com.cap;

interface Polygon {
	  void getArea(int length, int breadth);
}

class Rectangle implements Polygon {
	public void getArea(int length, int breadth) {
		System.out.println("The area of the rectangle is " + (length * breadth));
	}
}

public class InterfaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r1 = new Rectangle();
	    r1.getArea(5, 6);

	}

}
