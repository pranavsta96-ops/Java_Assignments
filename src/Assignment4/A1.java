package Assignment4;

public class A1 {

	//Write a java program to compare two strings, ignoring case differences.
	
	public static void main(String[] args) {

		String s1= "Pranav Singh";
		
		String s2 = "pranav Singh";
		

		if(s1.equalsIgnoreCase(s2))
		{
			System.out.println("Strings are equals");
		}
		else
		{
			System.out.println("Strings are not equal");
		}

		
		
	}

}
