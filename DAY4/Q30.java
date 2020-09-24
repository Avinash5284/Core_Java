

/* 30.	Create an integer type 2-D array of size [3X3]. Take the elements
 from the user and then calculate the sum of the elements present
 in the diagonal.*/
 
 
 
import java.util.Scanner;

class Q30
{
	public static void main(String argc[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter size of row ::");
		int row=sc.nextInt();
		int arr[][]=new int[row][];
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter size of col ::");
			 int col=sc.nextInt();
			 int arr1[]=new int[col];
			 for(int j=0;j<col;j++)
			 {
				 System.out.println("Enter elements in 1d array::");
				 arr1[j]=sc.nextInt();
			 }
			 arr[i]=arr1;
			
		}
		System.out.println("elements 2D array::");
		
		for(int ar[] : arr)
		{
			for(int trav : ar)
			{
				System.out.print(" "+trav);
			}
			System.out.println("  ");
		}
		
		System.out.println("Sum of diagonal elemnts ::");
		
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i.length];j++)
			{
				if(i==j){
				sum=sum+arr[i][j];
				}
			}
			System.out.println("Sum ::" +sum);
		}
		
	}
	
	
	
}