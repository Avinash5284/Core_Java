
import java.util.Scanner;

class Table_Loop
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr number :::");
		int num=sc.nextInt();
		
		for(int i=0;i<=10;i++)
		{
			int mul=num*i;
			System.out.println("Table = " +mul);
		}
	}
}