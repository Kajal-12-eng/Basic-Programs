package com.basicprograms;
import java.util.Scanner;

public class Quotient_Remainder{

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter dividend:: ");
		int dividend=scanner.nextInt();
		System.out.print("Enter divisor:: ");
		int divisor =scanner.nextInt();
		scanner.close();
		int quo=dividend/divisor;
		int rem=dividend%divisor;
		System.out.println("Quotient= "+quo);
		System.out.println("Remainder= "+rem);
	}

}
