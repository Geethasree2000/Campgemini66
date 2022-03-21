package com.capday1;

import java.util.Scanner;

public class MyScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//read int
		System.out.println("enter the integer:");
		int num = sc.nextInt();
		System.out.println(num);
		
		//read float
		System.out.println("enter float");
		float f = sc.nextFloat();
		System.out.println(f);

	}

}
