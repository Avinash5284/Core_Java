import java.util.Scanner;

class GreatestNumber
{
	public static void main(String argc[])
	
	{
		int x,y,z;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter three numbers");
		x=sc.nextInt();
		System.out.println("X is =" +x);
		y=sc.nextInt();
		System.out.println("y is =" +y);
		z=sc.nextInt();
		System.out.println("z is =" +z);
		
		if(x > y && x > z)
		{
			System.out.println("X is greater=" +x);
		}
		else if(y > x && y > z)
		{
			System.out.println("y is greater=" +x);
		}
		else
		{
			System.out.println("z is greater=" +z);
		}
	}
}