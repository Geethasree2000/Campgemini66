package com.capday1;

public class MaximiumElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[] = { 4, 24, 76, 2, 68 };
		int maximum = ar[0];
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] > maximum) {
				maximum = ar[i];
			}
		}
		System.out.println(maximum);
	}

}
