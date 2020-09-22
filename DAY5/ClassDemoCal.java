
import java.util.Scanner;

class MathOpe
{
	static double add(double a, double b)
	{
		
		return a+b;
	}
	static double sub(double a, double b)
	{
		
		return a-b;
	}
	static double mul(double a, double b)
	{
		
		return a*b;
	}
	static double power(double a, double b)
	{
		
	return(Math.pow(a,b));
	}
	
	void show(double num1,double num2)
	{
		double sum=add(num1,num2);
		System.out.println("Sum ::"+sum);
		//System.out.println("sub ::"+sub);
		//System.out.println("mul ::"+mul);
		double sub=sub(num1,num2);
		System.out.println("Substraction::"+sub);
		double mul=mul(num1,num2);
		System.out.println("Multiplication ::"+mul);
		double pow=power(num1,num2);
		System.out.println("Power ::"+pow);
	}
}
class ClassDemoCal
{
	public static void main(String argc[]){
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter first number");
		double num1=sc.nextDouble();
		System.out.println("Enter Second number");
		double num2=sc.nextDouble();
		//int s=MathOpe.add(num1,num2);
		//MathOpe.sub(int num1,int num2);
		//MathOpe.mul(int num1,int num2);
		//MathOpe.show(int num1,int num2);
		//System.out.println("sum ::"+s);
		MathOpe obj=new MathOpe();
		obj.show(num1,num2);
	}
	
}