package com.polymorphism;

class Sum {
	public void print(int a) {
		System.out.println(a);
	}

	public void print(int a, int b) {
		System.out.println((int) a + (int) b);
	}

	public void print(int a, int b, int c) {
		System.out.println((int) a + (int) b + (int) c);
	}
}

public class OverLoading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sum s = new Sum();
		s.print(10);
		s.print(10, 20);
		s.print(10, 20, 30);

	}

}
