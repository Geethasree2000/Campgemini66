package com.exceptionhandling;

public class UncheckedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ArithmeticException
		int a = 10;
		int b = 0;
		try {
			int c = a / b;
			System.out.println(c);
		} catch (ArithmeticException e) {
			System.out.println("number cannot be divided with 0");
		}

		// ArrayIndexOutOfBoundsException
		int ar[] = new int[3];
		try {
			ar[4] = 3;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBounds");
		}

		// NullPointer Exception
		String str = null;
		try {
			System.out.println(str.length());
		} catch (NullPointerException e) {
			System.out.println("NullPointer Exception");
		}

		// StringIndexOutOfBound Exception
		String s = "abcd";
		try {
			System.out.println(s.charAt(4));
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("StringIndexOutOfBound");
		}

		// NumberFormat Exception
		try {
			int num = Integer.parseInt("ABC");
			System.out.println(num);
		} catch (NumberFormatException e) {
			System.out.println("NumberFormat Exception");
		}
	}

}
