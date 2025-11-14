package Assignment3;

public class A1 {

	//Write a Java program to calculate sum values of an array.
	public static void main(String[] args) {

		int []a = {1,2,3,4,5, 9,7};
		
		int sum =0;
		
		/*
		 * for(int i=0; i<a.length; i++) { sum = sum+ a[i]; }
		 */
		
		for(int value:a)
		{
			sum =sum +value;
		}
		
		System.out.println("Sum of array:" + sum);
		
	}

}
