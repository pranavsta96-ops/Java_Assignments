package Assignment4;

import java.util.Scanner;

public class A12 {
	
	//Write a program to check a string is palindrome or not

	public static void main(String[] args) {
		
		System.out.println("Enter your value:- ");

		Scanner sc = new Scanner(System.in);
		
		String original = sc.nextLine();
		
		String clean = original.toLowerCase();
		
		String reversed = new StringBuilder(clean).reverse().toString();
		
		if(clean.equals(reversed))
		{
			System.out.println(original + "is a palindrome ");
		}
		
		else
		{
			System.out.println(original + "is not a palindrome");
		}
		
	}

}
