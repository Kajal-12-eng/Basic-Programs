package com.basicprograms;
import java.util.Scanner;

public class Vowels {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter alphabet to check vowels or cononant: ");
		char ch=s.next().charAt(0);
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			System.out.println(ch+ "is a vowel");
		else
			System.out.println(ch+ "is a consonant");
			}
    }
