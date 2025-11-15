package Assignment3;

public class A3 {
	
  //Write a Java program to print even and odd numbers in an array.
	public static void main(String[] args) {

		int a[] = {1,2,3,4,5,6,7,8,9};
		
		int even = 0; 
		int odd = 0;
		
		
		for(int i =0; i<a.length; i++)
		{
			if(a[i]%2 ==0)
			{
				even++;
			}
			
			else
			{
				odd++;
			}
		}
		
		System.out.println("Count of even numbers:"+ even);
		System.out.println("Count of odd numbers:"+ odd);
	}

}
