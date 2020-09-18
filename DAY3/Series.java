

import java.util.Scanner;

class Series
{
	public static void main(String argc[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter NUMBER ::");
		int num=sc.nextInt();
		int sum=0;
		
	    System.out.println("Power series of given number ::");
        
         for(int i=0;i<=num;i++)
		 {
			 sum = (num * (num + 1) * (2 * num + 1 )) / 6;
			 if(i !=num)
			 {
			 System.out.println(i+"^2");
			 }
		 else
		 {
			 System.out.println( "sum="+sum);
		 }			 
	}
}
}