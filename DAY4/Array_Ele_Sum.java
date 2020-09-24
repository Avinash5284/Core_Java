
import java.util.Scanner;

class Array_Ele_Sum
{
	public static void main(String argc[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size of row ::");
		int row=sc.nextInt();
		
		int arr[][]=new int[row][];
		
			for( int i=0;i<arr.length;i++){
				System.out.println("Enter column Size ::");
				int col=sc.nextInt();
				int arr1[]=new int[col];
				
				for(int j=0;j<col;j++)
				{
					System.out.println("Enter col elements ::");
					arr1[j]=sc.nextInt();
				}
				arr[i]=arr1;
			}
			
				System.out.println("Elements IN 2-D array :: ");
			
			for( int ar[] : arr)
			{
				for( int e : ar)
				{
						System.out.print(" "+e);
				}
					System.out.println(" ");
			}
             
             int sum=0;
             for( int i=0;i<arr.length;i++)
             {
				 for(int j=0;j<i+1;j++)
				 {
					 sum=sum +arr[i][j];
				 }
				 	System.out.println("Sum " +sum);
			 }				 
		
	}
}