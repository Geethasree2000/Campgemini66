package com.capday1;

import java.util.Scanner;

public class ArrayOfEvenNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[5];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < 5; i++) {
			if (a[i] % 2 == 0) {
				// System.out.println(a[i]);
			}
			if (a[i] % 2 != 0) {
				System.out.println(a[i]);
			}
		}

	}

}
