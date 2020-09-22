
class PersonDemo{
	private int age;
	private String perName;
	
	PersonDemo(String perName)
	{
		this(18,perName);
	}
	PersonDemo(int age,String perName)
	{
		this.age=age;
		this.perName=perName;
	}
	
	void show()
	{
		System.out.println("Age ::: " +age+ " person name ::"+perName);
	}
}
class Person{
	public static void main(String argc[])
	{
		PersonDemo p1=new PersonDemo("Avinash");
		p1.show();
		
		
	}
}