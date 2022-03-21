package com.capday1;

import java.util.Scanner;

public class MyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[5];
		int[] b = new int[5];
		b[0] = 1;
		b[1] = 2;
		b[2] = 3;
		b[3] = 4;
		b[4] = 5;
		for (int i = 0; i < 5; i++) {
			System.out.println(b[i]);
		}

		Scanner sc = new Scanner(System.in);
		String[] s = new String[5];
		for (int i = 0; i < 3; i++) {
			s[i] = sc.next();
		}
		for (int j = 0; j < 3; j++) {
			System.out.println(s[j]);
		}

	}

}
