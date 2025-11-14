package Assignment2;

import java.util.Scanner;

public class A3 {
	
	//Write a Java program that takes a year from user and print whether that year is a leap year or not

	public static void main(String[] args) {
		
		System.out.println("Enter your year");

		Scanner sc = new Scanner(System.in);
		
		int year = sc.nextInt();
		
		if(year%4==0 && year%100 !=0 || year %400 ==0)
		{
			System.out.println("Year is a leap year");
		}
		else
		{
			System.out.println("year is not the leap year");
		}
		
		
	}

}
