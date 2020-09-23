class OneBHK
{
	private double roomArea;
	private double hallArea;
	private double price;
	
	OneBHK()
	{
		this(1000.00,2000.00,5500.00);
	}
	OneBHK(double roomArea,Double hallArea,double price)
	{
		this.roomArea=roomArea;
		this.hallArea=hallArea;
		this.price=price;
	}
	void show(){
		System.out.println(roomArea+" "+hallArea+" "+price);
	}
}
class TwoBHK extends OneBHK{
	double room2Area;
	
	TwoBHK()
	{
		
		this(1000.00,2000.00,5500.00,5000.00);
		
	}
	TwoBHK(double roomArea,double hallArea,double price,double room2Area)
	{
		super(roomArea,hallArea,price);
		//OneBHK(roomArea,hallArea,price);
		this.room2Area=room2Area;
	}
	void show(){
		super.show();
		System.out.println(room2Area);
	}
	
	
}
class BHK
{
	public static void main(String argc[])
	{
		TwoBHK t=new TwoBHK();
		t.show();
	}
}