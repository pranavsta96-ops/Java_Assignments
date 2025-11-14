package Assignment2;

import java.util.Scanner;

public class A6 {

	//Write a Java program to reverse a number using while loop.
	
	public static void main(String[] args) {
		
		System.out.println("Enter your number");
		
		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();
		
		int reversed = 0;
		
		while(number !=0)
		{
			int digit = number%10;
			reversed = reversed*10+digit;
			number = number/10;
		}
		
		System.out.println("Reversed number: - "+reversed);
		
		
	}
	

}
