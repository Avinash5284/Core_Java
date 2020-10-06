package s1;


public class toStringDemo {
	
	String name;
	int roll;
	
	toStringDemo(String name,int roll){
		this.name=name;
		this.roll=roll;
	}
	public String toString() {
		return name + "....." +roll;
	}

	public static void main(String[] args) {
		toStringDemo t=new toStringDemo("Avi",102);
		System.out.println(t);
		System.out.println(t.toString());

	}

}
