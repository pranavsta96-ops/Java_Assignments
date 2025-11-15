package Assignment3;

public class A2 {

	//Write a Java program to calculate average of values of an array.
	public static void main(String[] args) {

		int a [] = {1,2,3,4,5,9};
		
		int sum = 0;
		int avg =0; 
		
		for(int i =0; i<a.length; i++)
		{
			sum = sum+ a[i];
		}
		
		avg = sum/a.length;
		
		System.out.println("Average of Array values is" + avg);
		
	}

}
