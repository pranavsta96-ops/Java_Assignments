package Assignment3;

public class A6 {
	
	//Write a program to find duplicate elements in an array.

	public static void main(String[] args) {

		int a[] = {1,2,3,4,5,6,3,4};
		
		for(int i =0; i<a.length; i++)
		{
			for(int j = i+1; j<a.length; j++)
			{
				if(a[i]== a[j])
				{
					System.out.println(a[i]);
					break;
				}
			}
		}

	}

}
