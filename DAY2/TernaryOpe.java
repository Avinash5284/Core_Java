import java.util.Scanner;

class TernaryOpe
{
	static public void main(String argc[])
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Eneter First element ::");
		int n1=sc.nextInt();
		System.out.println("First element ::" +n1);
		
		System.out.println("Eneter second element ::");
		int n2=sc.nextInt();
		System.out.println("Second element ::" +n2);
		
		System.out.println("Eneter Third element ::");
		int n3=sc.nextInt();
		System.out.println("Third element ::" +n3);
		
	   int max=(n1>n2)?(n1>n3 ? n1 : n2 ):(n2>n3 ? n2 : n3 );
		
		
		 System.out.println("Greatest =" +max);
	}
}