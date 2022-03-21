package com.capday1;

public class CompareStringsArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a[] = {"zee","star plus","sony","colors","stae movies"};
		
		String s1 = "A";
		String s2 = "A";
		//return 0 if both strings are equal 
		//return <0 if one lstrig is less thaan other
		//return >0 if one string is lexographically greater than other string
		//if s1 is equal to s2 return 0
		//if s1 is less than s2 return -ve number
		//if s1 is greater than s2 return +venumber
		
		int diff = s1.compareTo(s2);
		System.out.println(diff);
		
		for(int i = 0;i<a.length;i++){
			for(int j = 0;j<a.length;j++){
				if(a[i].compareTo(a[j]) < 0){
					String temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for(int i1 = 0;i1<a.length;i1++){
			System.out.println(a[i1]);
		}
	}

}
