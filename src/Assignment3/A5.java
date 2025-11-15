package Assignment3;

public class A5 {

	//Write a program to find greatest and smallest element in an array.
	public static void main(String[] args) {

		int a[] = {10,20,30,40,50};
		
		int min = a[0];
		
		int max= a[0];
		
		for(int i =0; i<a.length; i++)
		{
			if(a[i]<min)
			{
				min = a[i];
			}
			
			if(a[i]>max)
			{
				max = a[i];
			}
		}
		
		System.out.println("Minimum number is:"+ min);
		System.out.println("maximum number is:"+ max);
	
		
	}

}
