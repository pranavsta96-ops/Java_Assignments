package Assignment2;

import java.util.Scanner;

public class A8 {

	//Write a Java Program to print factorial of a given number using while loop, for loop.
	public static void main(String[] args) {

	
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your number");
		
		int num = sc.nextInt();
		
		long factorial = 1;
		
		//Using for loop
		/*
		 * for(int i =1; i<=num;i++) { factorial = factorial *i; }
		 * 
		 * System.out.println("Factorial of number is: " + factorial);
		 */
		
		//using while loop 
		
		int i =1;
		
		while(i<num)
		{
			factorial *=i;
			i++;
		}
		
		System.out.println("Factorial of number is:" +factorial);
		
		
		
		
	}

}

