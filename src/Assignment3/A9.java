package Assignment3;

import java.util.Scanner;

public class A9 {
	
	//Write a Java program to search specific element in an array.

	public static void main(String[] args) {

		int a[]= {10,20,30,40,50,60};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter element to search");
		
		int key = sc.nextInt();
		
		boolean found = false; 
		
		for(int i=0; i<a.length;i++)
		{
			if(a[i]==key)
			{
				System.out.println("Element "+key+" found at index "+ i);
				found = true;
				break;
			}
		}
		
		if(!found)
		{
			System.out.println("Element "+key+" not found in the array ");
		}
		sc.close();
		
	}

}
