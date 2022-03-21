package com.exceptionhandling;

class Person {
	// throws is ised to throw the exception at method level
	//throws exception at main method 
	public void print() throws Exception {
		String str = new String();
		//null pointer exception
		System.out.println(str.charAt(0));
		
	}
}

public class MyChainedException {
	// throwing exception to the compiler
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		try{
			Person p = new Person();
			p.print();
		}catch(Exception e){
			System.out.println("exception message");
		}
		
		
	}

}
