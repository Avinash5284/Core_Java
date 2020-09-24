/*29.	Write a program to print the total number of
 one-D arrays in a two-D array and the number of 
 elements in every one-D array present in the two-D arrays.*/
 
 
 import java.util.Scanner;
 
 class Q29
 {
	 public static void main(String argc[])
	 {
		 Scanner sc=new Scanner(System.in);
		 
		 System.out.println("Enter size of row :: ");
		 int row=sc.nextInt();
		 
		 int arr[][]=new int[row][];
		 int counter=0;
		 for(int i=0;i<arr.length;i++)
		 {
			  System.out.println("Enter size of col :: ");
		        int col=sc.nextInt();
				int arr1[]=new int[col];
				for(int j=0;j<col;j++)
				{
					System.out.println("Enter 1d array element ::");
					arr1[j]=sc.nextInt();
					counter++;
				}
				arr[i]=arr1;
			}
			System.out.println("2d array element ::");
			

			for(int ar[] : arr)
			{
				for(int trav : ar)
				{
					System.out.print(" "+trav);
				}
				System.out.println(" ");
			}
		 System.out.println("Total elements in 2D array::" +counter);
	     int counter1=0;
		  for(int i=0;i<arr.length;i++)
		 {
				for(int j=0;j<i;j++)
				{
					System.out.print("elements in 1D array::" );
					System.out.println(" " +arr[j].length);
					//counter1++;
				}
			 System.out.println(" " );
			}
		 //System.out.println("Total elements in 1D array::" +counter1);
		 
	 }
 }