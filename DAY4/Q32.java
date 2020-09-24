/*32.	Modify the above program (no. 31) to count the no of Student objects created. [ In this program static variable is required ]*/


import java.util.Scanner;
class student
{
	private int rno;
	private String name;
	private static int counter;
	
	void setData(int rno,String name)
	{
		this.rno=rno;
		this.name=name;
		counter++;
	}
	void show()
	{
		System.out.println(rno+ " " +name);
		System.out.println("Total no.of students object  " +counter);
	}
}
class Q32
{
	public static void main(String argc[])
	{
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<=10;i++)
		{
		System.out.print("Enter roll no::");
		int rno=sc.nextInt();
		
		System.out.print("Enter name::");
		String name=sc.next();
		
		
		student s1=new student();
		s1.setData(rno,name);
		s1.show();
		}
	}
}