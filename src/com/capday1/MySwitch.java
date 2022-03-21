package com.capday1;

import java.util.Scanner;

public class MySwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int day = sc.nextInt();
		switch(day){
		case 1:
			System.out.println("sun");
			break;
		case 2:
			System.out.println("Mon");
			break;
		case 3:
			System.out.println("Tue");
			break;
		case 4:
			System.out.println("Wed");
			break;
		case 5:
			System.out.println("thu");
			break;
		case 6:
			System.out.println("fri");
			break;
		case 7:
			System.out.println("sat");
			break;
		default:
			System.out.println("default");
		}
		

	}

}
