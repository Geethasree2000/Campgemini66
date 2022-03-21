package com.exceptionhandling;

import java.util.Scanner;

//checked or unchecked exception
//by default checked exception
//extends IOExcdeption class or exception class
//create unchecked exception by extending with runtimeexception

class OnlyPositiveNumberIsAllowed extends Exception{
	public OnlyPositiveNumberIsAllowed(String msg){
		super(msg);
	}
}

public class MyUserDefinedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			if(num > 0){
				System.out.println("number is "+num);
			}else{
			//throws exception that only allows positive number
				throw new OnlyPositiveNumberIsAllowed("only enter positive number");
			}
		}catch(OnlyPositiveNumberIsAllowed e){
			System.out.println("exception");
			e.printStackTrace();
		}

	}

}
