package Assignment8;

public interface calA {

	int a =10; 
	int b= 20; 
	
	default void add()
	{
		int add = a+b;
		
		System.out.println("Addition of two numbers: "+ add);
	}
}
