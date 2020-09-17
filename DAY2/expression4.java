class expression4
{
	public static void main(String argv[])
	{
		boolean x=true;
		boolean y=false;
		boolean z= x && y || !(x || y) ; 
		
		System.out.println("Value of x=" +x);
		System.out.println("Value of y=" +y);
		System.out.println("Value of z=" +z);
	}
}