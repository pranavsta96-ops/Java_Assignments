package Assignment2;

import java.util.Scanner;

public class A7 {

	//Write a Java program to check Number is Palindrome or not using while loop.
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number");
		
		int originalnumber = sc.nextInt();
		int number = originalnumber;
		int reversed =0;
		
		while(number !=0)
		{
			int digit = number%10;
			reversed = reversed *10 +digit;
			number/=10;
			
		}
		
		if(originalnumber ==reversed)
		{
			System.out.println(originalnumber+ "is a palindrome");
		}
		else
		{
			System.out.println(originalnumber+ "is not a palindrome");
		}
		
		sc.close();
	}

}
