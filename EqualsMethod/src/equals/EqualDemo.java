package equals;

public class EqualDemo {

	 int roll;
	 String name;
	 EqualDemo(int roll,String name){
		 this.name=name;
		 this.roll=roll;
		 
	 }
	/* public boolean equals(Object obj) {
		 try {
		 int roll1=this.roll;
		 String name1=this.name;
		 
		 EqualDemo s=(EqualDemo)obj;
		 int roll2=s.roll;
		 String name2=s.name;
		 
		 if(name1.equals(name2) && roll1==roll2 )
		 {
			 return true;
		 }
		 else
		 {
			 return false;
		 }
		 }catch(ClassCastException e)
		 {
			 return false;
		 }
		 catch(NullPointerException e)
		 {
			 return false;
		 }
	 }*/
public boolean equals(Object obj) {
		 if(obj==this) {return true;}
		 if(obj instanceof EqualDemo) {
			 EqualDemo s=(EqualDemo)obj;
			 if(name.equals(s.name) && roll==s.roll)
			 {
				 return true;
			 }
			 else
			 {
				 return false;
			 }
			
		 }
		 return false;
	 }
	
	public static void main(String[] args) {
		EqualDemo e1=new EqualDemo(101,"Avi");
		EqualDemo e2=new EqualDemo(102,"Avvvi");
		EqualDemo e3=new EqualDemo(101,"Avi");
		EqualDemo e4=e1;
		System.out.println(e1.equals(e2));
		System.out.println(e1.equals(e3));
		System.out.println(e2.equals(e3));
		System.out.println(e1.equals(e4));
		System.out.println(e1.equals("Avi"));
		System.out.println(e1.equals(null));
		System.out.println(e1==e3);

	}

}
