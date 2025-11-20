package Assignment8;

public interface A {

	int a =10; 
	int b =20; 
	
	default void sum()
	{
		System.out.println("Sum of numbers: "+ (a+b));
	}
}
