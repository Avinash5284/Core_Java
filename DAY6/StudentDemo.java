import java.util.Scanner;
class student
{
	private int rollNo;
	 double percentage;
	
	student()
	{
		this(10,95.65);
	}
	student(int rollNo,double percentage)
	{
		this.rollNo=rollNo;
		this.percentage=percentage;
	}
	void show()
	{
		System.out.print(rollNo+" "+percentage);
	}
}
class CollegeStudent extends student
{
	private int semester;
	
	CollegeStudent()
	{
		this(10,95.65,2);
	}
	CollegeStudent(int rollNo,double percentage,int semester)
	{
		super(rollNo,percentage);
		this.semester=semester;
	}
	void show()
	{
		super.show();
		System.out.println(" "+semester);
	}
	
	
}
class SchoolStudent extends student
{
	private String className;
	
	SchoolStudent()
	{
		this(10,95.65,"12 th");
	}
	SchoolStudent(int rollNo,double percentage,String className)
	{
		super(rollNo,percentage);
		this.className=className;
	}
	void show()
	{
		super.show();
		System.out.println(" "+className);
	}

}
class StudentDemo
{
	public static void main(String argc[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter details for --college---student ::");
		
		System.out.println("enter details for 1St student ::");
		System.out.println("enter rollno ::");
		int r1=sc.nextInt();
		
		System.out.println("enter percentage ::");
		double p1=sc.nextDouble();
		
	    System.out.println("enter semester ::");
		int s1=sc.nextInt();
		
		
		/*-----second clg student -----*/
		
		System.out.println("enter details for 2nd student ::");
		System.out.println("enter rollno ::");
		int r2=sc.nextInt();
		
		System.out.println("enter percentage ::");
		double p2=sc.nextDouble();
		
		System.out.println("enter semester ::");
		int s2=sc.nextInt();
		
		
		/*---third clg st---*/
		
		System.out.println("enter details for 3rd student ::");
		System.out.println("enter rollno ::");
		int r3=sc.nextInt();
		
		System.out.println("enter percentage ::");
		double p3=sc.nextDouble();
		
		System.out.println("enter semester ::");
		int s3=sc.nextInt();
		
		/*----4th clg student----*/
		System.out.println("enter details for 4th student ::");
		System.out.println("enter rollno ::");
		int r4=sc.nextInt();
		
		System.out.println("enter percentage ::");
		double p4=sc.nextDouble();
		
		System.out.println("enter semester ::");
		int s4=sc.nextInt();
		
		/*----------------------------------------------------------*/
		   CollegeStudent co1=new CollegeStudent(r1,p1,s1);
		   CollegeStudent co2=new CollegeStudent(r2,p2,s2);
		   CollegeStudent co3=new CollegeStudent(r3,p3,s3);
		   CollegeStudent co4=new CollegeStudent(r4,p4,s4);
		
		/*----------------------------------------------------------*/
		  
		/*---1 st school student--*/
		
		System.out.println("enter details for --school---student ::");
		
		System.out.println("enter details for 1St student ::");
		System.out.println("enter rollno ::");
		int r5=sc.nextInt();
		
		System.out.println("enter percentage ::");
		double p5=sc.nextDouble();
		
		
		System.out.println("enter className ::");
	    String c5=sc.next();
		
		/*---2nd student---*/
		System.out.println("enter details for 2nd student ::");
		System.out.println("enter rollno ::");
		int r6=sc.nextInt();
		
		System.out.println("enter percentage ::");
		double p6=sc.nextDouble();
		
		System.out.println("enter className ::");
	    String c6=sc.next();
		
		/*------------------------------------------------*/
		
		 SchoolStudent sc1=new SchoolStudent(r5,p5,c5);
		 SchoolStudent sc2=new SchoolStudent(r6,p6,c6);
		
		/*---------------------------------------------------*/
		
		 student arr[]={co1,co2,co3,co4,sc1,sc2};
		 
		 for(student tr : arr)
		 {
			 tr.show();
		 }
		
		 int counter=0;
		 for(int i=0;i<arr.length;i++)
		 {
			 if(arr[i].percentage>75)
				 ++counter;
		 }
		 
		 System.out.println("No. of students having more than 75 per ==::" +counter );
		
	}
}
