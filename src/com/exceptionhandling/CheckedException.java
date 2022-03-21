package com.exceptionhandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CheckedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// IOEException
		File f = new File("test.txt");
		FileInputStream fileInputStream = null;
		try {
			fileInputStream = new FileInputStream(f);
			fileInputStream.read();
		} catch (IOException e) {
			System.out.println("io Exception");
		}

		// FileNotFound Exception
		File file = new File("C://file.txt");

		try {
			FileReader fr = new FileReader(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("file is not found");
		}
		
		
		//ClassNotFoundException
		try {
			Class.forName("Employee");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Class Not Found Exception");
		}

	}

}
