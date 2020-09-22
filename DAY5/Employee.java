
import java.util.Scanner;
class EmployeeDemo{
	private static int empNo;
	private double salary;
	private static double totalSalary;
	
	EmployeeDemo(double salary)
	{
		this.totalSalary=this.totalSalary+salary;
		empNo++;
	}
	void show()
	{
		System.out.println("No.of employees ::" +empNo+ " totalSalary ::" +totalSalary);
	}
}
class Employee
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter salary");
		double sal =sc.nextDouble();
		EmployeeDemo e1=new EmployeeDemo(sal);
		EmployeeDemo e2=new EmployeeDemo(sal);
		EmployeeDemo e3=new EmployeeDemo(sal);
		EmployeeDemo e4=new EmployeeDemo(sal);
		e1.show();
		e2.show();
		e3.show();
		e4.show();
	}
}