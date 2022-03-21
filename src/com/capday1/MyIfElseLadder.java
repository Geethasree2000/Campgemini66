package com.capday1;

import java.util.Scanner;

public class MyIfElseLadder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int day = sc.nextInt();
		if(day == 1){
			System.out.println("sun");
		}else if(day == 2){
			System.out.println("mon");
		}else if(day == 3){
			System.out.println("tue");
		}else if(day == 4){
			System.out.println("wed");
		}else if(day == 5){
			System.out.println("thur");
		}else if(day == 6){
			System.out.println("fri");
		}else{
			System.out.println("sat");
		}

	}

}
