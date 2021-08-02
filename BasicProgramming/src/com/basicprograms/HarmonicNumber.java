package com.basicprograms;
import java.util.Scanner;

public class HarmonicNumber{

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number to check harmonic: ");
		int n = scanner.nextInt();
		double H=0;
		if(n>0)
		{
			for (int i = 1; i < n; i++) 
			H=H+(1.0/i);
			System.out.println("Harmonic number is:" +H);
		}
		else
			System.out.println("Enter number greater than 0");
			
		}
	}

