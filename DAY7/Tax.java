
import java.util.Scanner;

interface Taxable
{
	double salesTax=7;
	double incomeTax=10.5;
}
abstract class Atax
{
    double tax;
    
   abstract void calTax();

     void showData()
	 {
		 System.out.println("Total tax ::"+tax);
	 }	 
}

class Employee extends Atax implements Taxable
{
	private int empId;
	private String name;
	private double salary;
	
	Employee(int empId,String name,double salary)
	{
		this.empId=empId;
		this.name=name;
		this.salary=salary;
	}
	
	void calTax(){
		
		tax=(incomeTax*salary)/100;
		
	}
	
}

class product extends Atax implements Taxable
{
	
	private int pid;
	double price;
	int quantity;
	
	product(int pid,double price,int quantity)
	{
		this.pid=pid;
		this.price=price;
		this.quantity=quantity;
	}
	void calTax()
	{
		tax=(salesTax*price*quantity)/100;
	}
	
	
}

class Tax{
	
	public static void main(String argc[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your choice 1 or 2 ");
		System.out.println("Enter your choice 1 for Employee ");
		System.out.println("Enter your choice  2 for product");
		
	
		int choice=sc.nextInt();
		
		switch(choice)
		{
			case 1:
			        System.out.println("Enter Employee detail ::");
					
					System.out.println("Enter Employee id ::");
					
					int empId=sc.nextInt();
					
					System.out.println("Enter Employee name ::");
					String name=sc.next();
					
					System.out.println("Enter Employee salary::");
					double salary=sc.nextDouble();
					
					Employee e1=new Employee(empId,name,salary);
					e1.calTax();
					e1.showData();
					
					break;
					
			case 2:		
					 System.out.println("Enter product detail ::");
					
					System.out.println("Enter product id ::");
					
					int pid=sc.nextInt();
					
					System.out.println("Enter product price ::");
					
					double price=sc.nextDouble();
					
					System.out.println("Enter product quantity ::");
					
					int quantity=sc.nextInt();
					
					product p1=new product(pid,price,quantity);
					p1.calTax();
					p1.showData();
					break;
					
			default:
                   System.out.println("Invalid");			
					
		}
		
		
	}
	
	
	
}