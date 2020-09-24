
import java.util.Scanner;

class StringArray{
	
	public static void main(String argc[])
	{
		Scanner sc=new Scanner(System.in);
		
		int size=sc.nextInt();
		
		String arr[]=new String[size];
		sc.nextLine();
		
		for( int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextLine();
		}
		for( String s : arr)
		{
			System.out.println(s);
		}
	}
	
}
