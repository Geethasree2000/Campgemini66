package com.exceptionhandling;

import java.util.Scanner;

//if class extends RuntimeException it is unchecked exception
//if class extends Exception or IOException then it is checked exception

class OnlyEvenNumException extends RuntimeException {

	public OnlyEvenNumException(String message) {
		super(message);
	}
}

public class UserDefinedUncheckedExceptionEvenNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if (num % 2 == 0) {
			System.out.println("the  number is even");
		} else {
			throw new OnlyEvenNumException("the number is odd");
		}
	}
}
