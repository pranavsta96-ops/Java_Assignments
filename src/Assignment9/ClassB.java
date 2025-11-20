package Assignment9;

//int a[]=null;

public class ClassB {

	public static void main(String[] args) {

		try {
		int []a = null;
		
		System.out.println(a.length);
		}
		catch(Exception e)
		{
		   System.out.println(e);
		}
		finally
		{
			System.out.println("Exception handled sucessfully");
		}
		
	}

}
