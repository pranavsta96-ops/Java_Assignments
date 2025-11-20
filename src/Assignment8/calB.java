package Assignment8;

public interface calB {
	
	int a =10; 
	int b =20; 
	
	default void mul()
	{
		int multiply = a*b;
		
		System.out.println("Multiplication of numbers: "+ multiply);
	}

}
