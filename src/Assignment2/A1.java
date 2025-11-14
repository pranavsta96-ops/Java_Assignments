package Assignment2;

import java.util.Scanner;

public class A1 {

	//Write a Java program to get a number from the user and print whether it is positive or negative
	public static void main(String[] args) {
		
		System.out.println("Enter your value:- ");

		Scanner sc = new Scanner(System.in);
		
		int num =sc.nextInt();
		
		if(num%2==0)
		{
			System.out.println("Number is positive");
		}
		else
		{
			System.out.println("Number is negative");
		}
		
	}

}
