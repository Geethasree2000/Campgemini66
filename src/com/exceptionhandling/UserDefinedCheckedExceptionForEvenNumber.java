package com.exceptionhandling;

import java.io.IOException;
import java.util.Scanner;

//if class extends RuntimeException it is unchecked exception
//if class extends Exception or IOException then it is checked exception

class OnlyEvenNumberException extends IOException {

	public OnlyEvenNumberException(String msg) {
		super(msg);
	}
}

public class UserDefinedCheckedExceptionForEvenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			if (num % 2 == 0) {
				System.out.println("the num is even");
			} else {
				throw new OnlyEvenNumberException("the num is odd");
			}
		} catch (OnlyEvenNumberException e) {
			System.out.println("exception");
			e.printStackTrace();
		}
	}
}
