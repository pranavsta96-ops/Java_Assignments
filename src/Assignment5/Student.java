package Assignment5;


public class Student {
	
  	int SID; 
	String Sname;
	int sub1;
	int sub2; 
	int sub3;
	int sum;
	
	void getStudentData(int id, String name)
	{
		SID = id;
		Sname = name;
		
		System.out.println("Student id: " +SID);
		System.out.println("Student Name: "+Sname);
	}
	
	void getStuMarks(int s1, int s2, int s3 )
	{
		sub1 = s1;
		sub2= s2;
		sub3= s3;
		
		System.out.println("Subject1: " + sub1);
		System.out.println("Subject2: "+ sub2);
		System.out.println("Subject3: "+ sub3);
	}
	
	
	   int gettotalMarks()
	{
		
	    
		sum = sub1+sub2+sub3;
		System.out.println("Total marks: "+ sum);
		return sum;
	}
	


	public static void main(String[] args) {
		
		System.out.println("Details of students:- ");
		
		Student st1 = new Student();
		Student st2 = new Student();
	
		System.out.println("Detail of first Student: - ");
		st1.getStudentData(001, "Pranav Singh");
		st1.getStuMarks(75, 85, 92);
		st1.gettotalMarks();
		
		System.out.println("Detail of second student: ");
		st2.getStudentData(002, "Alpesh Patel");
		st2.getStuMarks(75, 65, 71);
		st2.gettotalMarks();
		
		
		
		

		
	}

}
