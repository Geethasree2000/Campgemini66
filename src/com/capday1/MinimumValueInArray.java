package com.capday1;

public class MinimumValueInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[] = { 4, 24, 76, 2, 68 };
		int miniimum = ar[0];
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] < miniimum) {
				miniimum = ar[i];
			}
		}
		System.out.println(miniimum);
	}

}
