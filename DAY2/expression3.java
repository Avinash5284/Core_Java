class expression3
{
	public static void main(String argv[])
	{
		int x=10;
		int y=20;
		int z= x++ - --y - --x + x++;
		
		System.out.println("Value of x=" +x);
		System.out.println("Value of y=" +y);
		System.out.println("Value of z=" +z);
	}
}