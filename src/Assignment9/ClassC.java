package Assignment9;

public class ClassC {

	public static void main(String[] args) {

		try {
		String s ="ABC";
		
		int i = Integer.parseInt(s);
		
		System.out.println(i);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("Exception handled successfully...");
		}
	}

}
