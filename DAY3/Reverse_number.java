import java.util.Scanner;

class Reverse_number
{
	public static void main(String argc[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number :::");
		int num=sc.nextInt();
		int sum=0;
		
		while(num!=0)
		{
			int digit=num%10;
			sum=sum*10+digit;
			num=num/10;
		}
		System.out.println("Reverse number :::" +sum);
	}
}