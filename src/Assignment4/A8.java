package Assignment4;

public class A8 {
	
	//Write a Java program to count number of time a character repeated in a string.

	public static void main(String[] args) {

		String s = "Welcome to the Java";
		
		char target = 'e';
		
		int count =0; 
		
		s =s.toLowerCase();
		
		target = Character.toLowerCase(target);
		
		for(int i =0; i<s.length(); i++)
		{
			if(s.charAt(i)==target)
			{
				count++;
			}
		}
		
		System.out.println("Character "+ target+" 'appears' "+ count+ " times.");
	}

}
