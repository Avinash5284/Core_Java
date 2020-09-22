import java.util.Scanner;
class Circle_area{
	
	private double radius;
	private double area;
	
	void init(double r)
	{
		radius=r;
		
	}
	void CalculateArea(double r)
	{
		area=3.14*r*r;
	}
	void show()
	{
		System.out.println(" Radius :: "+radius);
		System.out.println(" Area :: "+area);
	}
}
class CircleDemo{
	
	public static void main(String argc[])
	
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter radius");
		double r=sc.nextDouble();
		Circle_area c=new Circle_area();
		c.init(r);
		c.CalculateArea(r);
		c.show();
	}
}