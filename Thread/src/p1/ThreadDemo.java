package p1;

public class ThreadDemo {

	public static void main(String[] args) {
		System.out.println("main started");
		Mythread th=new Mythread();
		th.start();
		System.out.println("main end");

	}

}
class Mythread extends Thread{
	
 public void run() {
	 for(int i=0;i<10;i++) {
		 System.out.println(i);
	 }
		 
 }
	
}
