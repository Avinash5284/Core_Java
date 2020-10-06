package p1;

public class Asychronous {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName()+"main started");
		Myrunnable4 m=new Myrunnable4();
		Thread th1=new Thread(m);
		Thread th2=new Thread(m);
		
		th1.start();
		th2.start();
		
		System.out.println(Thread.currentThread().getName()+"main finished");

	}

}
class Myrunnable4 implements Runnable{
	
	
	public void run()
	{
		System.out.println(Thread.currentThread().getName()+"child started");
		for(int i=0;i<10;i++)
		{
		
			try {
				Thread.sleep(100);
			}catch(InterruptedException e) {}
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
		System.out.println(Thread.currentThread().getName()+"child finished");
	}
}