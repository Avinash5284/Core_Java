

class SearchElement
{
	public static void main(String argc[])
	{
	
		int arr[]={1,2,3,4,5};
		int toFind =3;
		
		boolean found =false;
		
		for(int n : arr)
		{
			if(n==toFind)
			{
				found=true;
				break;
			}
		}
	   if(found)
	   System.out.println(toFind+ "isfound ");
        else
		System.out.println(toFind+ " not found");
	}
}