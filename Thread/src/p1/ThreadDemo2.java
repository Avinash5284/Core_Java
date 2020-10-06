package p1;

public class ThreadDemo2 {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getId()+"main started");
		Myrunnable m =new Myrunnable();
		Thread th=new Thread(m);
		th.start();
		System.out.println(Thread.currentThread().getId()+"main end");

	}

}
class Myrunnable implements Runnable{
	
 public void run() {
	 System.out.println(Thread.currentThread().getId()+"start");
	 for(int i=0;i<10;i++) {
		
		 try {
			 Thread.sleep(500);
		 }catch(InterruptedException e) {}
		 System.out.println(i);
	 }
	 System.out.println(Thread.currentThread().getId()+" end");
 }
	
}
