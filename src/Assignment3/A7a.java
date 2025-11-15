package Assignment3;

public class A7a {
	
	//Write a program to check equality of arrays.
	
	//Using for loop

	public static void main(String[] args) {

		int a[] = {1,2,3,4,5};
		int b[] = {1,2,3,4,5};
		
		boolean isEqual = true;
		
		if(a.length != b.length)
		{
			isEqual= false; 
		}
		else
		{
			for(int i =0; i<a.length; i++)
			{
				if(a[i]!=b[i])
				{
					isEqual =false;
					break;
				}
			}
		}
		
		if(isEqual)
		{
			System.out.println("Arrays are equal");
		}
		else
		{
			System.out.println("Arrays are not equal");
		}
		
		
	}

}
