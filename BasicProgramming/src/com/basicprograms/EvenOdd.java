package com.basicprograms;
import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number to check even or odd:: " );
		int num = scan.nextInt();
		scan.close();	
	    boolean result = isEven(num);
	  	if (result) 
		System.out.println("Number is even:: " +num);
	    else  
		System.out.println("Number is odd:: " +num);
	}

 public static boolean isEven (int num) {
	 return (num%2 == 0);
 }
}
