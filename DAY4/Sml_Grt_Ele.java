
import java.util.Scanner;

class Sml_Grt_Ele
{
	public static void main(String argc[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of row ::");
		
		int row=sc.nextInt();
		
		int arr[][]=new int[row][];
		
		for( int i=0;i<arr.length;i++)
		{
			System.out.println("Enter size of col::");
            int col=sc.nextInt();
			int arr1[]=new int[col];
			for( int j=0;j<col;j++)
			{
				System.out.println("Enter elements in 1D array ::");
		
				arr1[j]=sc.nextInt();
				
			}
			arr[i]=arr1;
			
            		
		}
		System.out.println("Elements Of 2D array ::");
		for(int ar[]:arr)
		{
			for(int e:ar)
			{
				
				System.out.print(" " +e);
		
		
			}
			System.out.println("");
		}
		
		int min=0;
		int max=0;
		boolean flag=true;
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				if(flag==true){
					min=arr[i][j];
					max=arr[i][j];
				}
				if(min > arr[i][j])
					min = arr[i][j];

				if(max < arr[i][j])
					max = arr[i][j];

				flag = false;
					
			}
		}
		System.out.println("The min element from given array is : "+min);
		System.out.println("The max element from given array is : "+max);	
	}
}