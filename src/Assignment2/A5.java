package Assignment2;

import java.util.Scanner;

public class A5 {
	
	//Write a Java program count the number of digits of the number using while loop.

	public static void main(String[] args) {
		
		System.out.println("Entwer your number");
	
	
		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();
		
		int count =0;
		
		if(number==0)
		{
			count =1;
		}
		else {
			
			while(number>0)
			{
				number = number/10;
				count ++;
			}
		}
		
		System.out.println("Number of digits:- "+ count);
		sc.close();
		
		
		
	}

}
