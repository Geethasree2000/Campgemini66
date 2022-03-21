package com.capday1;

public class SortArrayInDescendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 4, 24, 76, 2, 68 };
		int num = 0;

		// iterate the array
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (a[j] < a[i]) {//descending
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}

		}
		// System.out.println(num);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

}
