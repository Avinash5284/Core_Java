package p1;

public class Asychronous2 {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName()+"main started");
		PrintMessage pm=new PrintMessage();
		Myrunnable5 m=new Myrunnable5(pm);
		Thread th1=new Thread(m);
		Thread th2=new Thread(m);
		
		th1.start();
		th2.start();
		
		System.out.println(Thread.currentThread().getName()+"main finished");

	}

}
class Myrunnable5 implements Runnable{
	
	PrintMessage p;
	Myrunnable5(PrintMessage p)
	{
		this.p=p;
	}	
	public void run()
	{
		System.out.println(Thread.currentThread().getName()+"child started");
		p.printmsg();
				System.out.println(Thread.currentThread().getName()+"child finished");
	}
}
class PrintMessage{
	void printmsg() {
		for(int i=0;i<10;i++)
		{
		
			try {
				Thread.sleep(100);
			}catch(InterruptedException e) {}
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
		
	}
}