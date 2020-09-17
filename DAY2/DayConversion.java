
import java.util.Scanner;

class DayConversion
{
	public static void main(String arg[])
	{
	   Scanner sc=new Scanner(System.in);
       System.out.println("Enter days");
       int d=sc.nextInt();

	   int year=d/365;
	   
	   int month=d/30;
	   
	   System.out.println("no of years=" +year);
	    System.out.println("no of months=" +month);
		 System.out.println("no of days=" +d);
	}
}