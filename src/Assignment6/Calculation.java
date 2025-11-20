package Assignment6;

public class Calculation {
	
	int sum(int x, int y)
	{
		int sum = x+y;
		return sum;
		
	}
	
	int sum(int x, int y, int z)
	{
		int sum = x+y+z;
		return sum;
	}
	
	double sum(double x, double y)
	{
		double sum = x+y;
		return sum;
		
	}
	
	double sum (double x, double y, double z)
	{
		double sum = x+y+z;
		return sum;
	}

	public static void main(String[] args) {

		
		Calculation cl = new Calculation();
		
		int sumint1 =cl.sum(10, 15);
		System.out.println("Sum of 2 integers: "+sumint1);
		
		int sumint2 =cl.sum(10, 15, 25);
		System.out.println("Sum of 3 integers: "+ sumint2);
		
		double sumdl1 =cl.sum(10.25, 15.25);
		System.out.println("Sum of 2 double: "+ sumdl1);
		
		double sumdl2=cl.sum(10.25, 15.25, 24.50);
		System.out.println("Sum of 3 double: "+ sumdl2);
		
		
		
		
	}

}
