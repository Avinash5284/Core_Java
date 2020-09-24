/*31.	Create a class Student with 2 data members rno and name. Create one method setData() 
that takes roll number and student name as parameter and stores them in data members rno and name. 
Create one more method showData() to print the data member values. Create another class ( main class) 
StudentDemo that creates Student class object and calls setData() and showData() methods.*/
import java.util.Scanner;
class student
{
	private int rno;
	private String name;
	
	void setData(int rno,String name)
	{
		this.rno=rno;
		this.name=name;
	}
	void show()
	{
		System.out.println(rno+ " " +name);
	}
}
class Q31
{
	public static void main(String argc[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter roll no::");
		int rno=sc.nextInt();
		
		System.out.print("Enter name::");
		String name=sc.next();
		
		student s1=new student();
		s1.setData(rno,name);
		s1.show();
		
	}
}