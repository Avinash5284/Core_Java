package p1;

public class ThreadDemo3Join {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getId()+"main started");
		Myrunnable3 m =new Myrunnable3();
		Thread th=new Thread(m);
		th.start();
		try {
			th.join();
		}catch(InterruptedException e) {}
		
		System.out.println(Thread.currentThread().getId()+"main end");

	}

}
class Myrunnable3 implements Runnable{
	
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
