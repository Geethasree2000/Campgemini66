package com.exceptionhandling;

public class MyException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c = 0;
		int a = 10;
		int b = 0;
		String str = null;
		//java.lang.NullPointerException
		//System.out.println(str.charAt(0));
		// there is a rulle that we cannot dive a num with 0
		
		int[] ar = new int[20];
		//java.lang.ArrayIndexOutOfBoundsException: 30
		System.out.println(ar[30]);
		try {
			//AArithmetic exception
			//c = a / b;
			System.out.println(c);
			// exception class ->arithmatic exception
			// exception method
		} catch (Exception e) {
			System.out.println("cannon divide with 0");
		}
		//System.out.println(c);
		//filenotfoundexception
	}

}
