
import java.util.Scanner;

abstract class Processor{
	int data;
	void showData(){
		System.out.println("Data :: " +data);
	}
	abstract void process();
}
class Factorial extends Processor
{
	void process(){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter number ::");
		int num=sc.nextInt();
		
		int fact=1;
		
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
			data=fact;
		}
		  
		}
	
}

class Circle extends Processor{
	
	final double PI=3.14;
	
	void process()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter radius::");
		double r=sc.nextDouble();
		
		double area=PI*r*r;
		
		data=(int)area;
		
	}
	
	
}
class Fact_Area
{
	public static void main(String argc[])
	{
		System.out.println("Enter your choice 1 or 2 ");
		System.out.println("Enter your choice 1 for factorial ");
		System.out.println("Enter your choice  2 for area of circle");
		
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		
		switch(choice)
		{
			case 1:
			   Factorial f=new Factorial();
			   f.process();
			   f.showData();
			   break;
			
			case 2:
			Circle c=new Circle();
			c.process();
			c.showData();
			break;
			 
			
			default:
			   System.out.println("Invalid  ");
			
		}
		
	}
}