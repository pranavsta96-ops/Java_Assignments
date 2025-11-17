package Assignment5;

public class Calculation {
	
	int a ; 
	int b;
	int c;
	
	Calculation()
	{
		a=15;
		b=25;
		c=10;
		
	}
	
	void sum()
	{
		int sum = a+b+c;
		
		System.out.println("Sum of the value: "+ sum);
	}

	public static void main(String[] args) {

		Calculation cl = new Calculation();
		
		cl.sum();
				
		
	}

}
