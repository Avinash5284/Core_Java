import java.util.Scanner;

class PrimeNumber
{
	public static void main(String argc[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number ::");
		int num=sc.nextInt();
		boolean check=false;
		
		for(int i=2;i<=num/2;++i)
		{
			if(num%i==0)
			{
				check=true;
				break;
			}
		}
		if(!check)

			System.out.println("Given number is prime");
		
		else
		
		   System.out.println("Given number is not prime");
			
		}
	}
