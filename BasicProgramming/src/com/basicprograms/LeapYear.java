package com.basicprograms;
import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the year:: ");
		int year =scan.nextInt();
		scan.close();
		if(year<100)
		{
			System.out.println("Enter a valid Year ");
		}
		
		else if((year%4==0 && year%100!=0) || year%400==0)
		{
			System.out.println("Entered year is Leap year");
		}
		else
			System.out.println("Entered year is not leap year");
	}
     
}

