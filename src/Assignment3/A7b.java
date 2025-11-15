package Assignment3;

import java.util.Arrays;

public class A7b {
	
	/*
	 * Write a program to check equality of arrays. • Using Arrays.
	 * equals () method
	 */

	public static void main(String[] args) {


		int a[] = {1,2,3,4,5};
		int b[] = {1,2,3,4,6};
		
		if(Arrays.equals(a, b))
		{
			System.out.println("Arrays are equal");
		}
		else
		{
			System.out.println("Arrays are not equal");
		}
		
	}

}
