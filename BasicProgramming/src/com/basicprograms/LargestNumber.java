package com.basicprograms;
import java.util.Scanner;

public class LargestNumber {

		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter First Number ::");
			int a = scanner.nextInt();
			System.out.println("Enter Second Number ::");
			int b  = scanner.nextInt();
			System.out.println("Enter Third Number ::");
			int c  = scanner.nextInt();
			if(a>b && a>c) 
				System.out.println("A is greater than B and C");
			else if(b>a && b>c) 
				System.out.println("B is greater than A and C");
			else 
				System.out.println("c is greater than A and B");
	    }
    }


