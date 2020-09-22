
class ThisDemo{
	
	private int id;
	private String name;
	
	ThisDemo()
	{
		this(100,"avinash");
		System.out.println("no arg");
	}
	ThisDemo(int id,String name)
	{
		this.id=id;
		this.name=name;
		System.out.println("with arg");
	}
}
class ThisConstruct{
	
	public static void main(String argc[]){
		ThisDemo t=new ThisDemo();
	}
}