
import java.util.Scanner;

class LeapYear
{
	public static void main(String rgc[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Year =");
		int year=sc.nextInt();
		
		System.out.println(" Year =" +year);
		
		if(year%4==0 && year%100!=0 || year%400==0)
		{
			System.out.println(" Year is leap =" +year);
		}
		else
		{
			System.out.println(" Year is not leap =" +year);
		}
	}	
}