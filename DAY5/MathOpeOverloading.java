
import java.util.Scanner;

class MathOpe{
	

	
	static void mul(int a,int b)
	{
		System.out.println("multiplication of two integers ::" + (a*b));
	}
	static void mul(float a,float b,float c)
	{
		System.out.println("multiplication of three floats ::" + (a*b*c));
	}
	static void mul(double a,int b)
	{
		System.out.println("multiplication of one double and one int ::" + (a*b));
	}
	static void mul(int arr[])
	{
		int res=1;
		
		for(int i=0;i<arr.length;i++){
			res=res*arr[i];
		}
		System.out.println("Res::" +res);
	}
	
}
class MathOpeOverloading{
	
	public static void main(String argc[])
	{
		Scanner sc=new Scanner(System.in);
		MathOpe m=new MathOpe();
		System.out.println("Enter four elements");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int num3=sc.nextInt();
		double num4=sc.nextDouble();
		int arr[]=new int[] {10,20,30};
		
		MathOpe.mul(num1,num2);
		MathOpe.mul(num1,num2,num3);
		MathOpe.mul(num4,num2);
		
		
	    MathOpe.mul(arr);
	}
}