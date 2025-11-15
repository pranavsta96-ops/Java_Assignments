package Assignment3;

public class A4 {
	
	//Write a Java program to find missing number in an array.

	public static void main(String[] args) {

		int []a = {1,2,4,5,6,7,8,9,3};
		
		int miss =0;
		int sum = 0;
		
		for(int i = 0; i<a.length; i++)
		{
		   sum = sum+a[i];
		   
		}
		
		if(sum !=45)
		{
			miss = 45-sum;
			System.out.println("Missing number is"+ miss);
		}
		
		else
		{
			System.out.println("There is no missing number");
		}
		
	}

}
