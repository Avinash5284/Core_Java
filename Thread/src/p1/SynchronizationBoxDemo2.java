package p1;

public class SynchronizationBoxDemo2 {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName()+"Main Started");
		PrintMessage2 pm=new PrintMessage2();
		Myrunnable7 m=new Myrunnable7(pm);
		Thread th1=new Thread(m);
		Thread th2=new Thread(m);
		th1.start();
		th2.start();
		System.out.println(Thread.currentThread().getName()+"Main Finished");
	}

}
class Myrunnable7 implements Runnable{
	PrintMessage2 p;
	
	Myrunnable7(PrintMessage2 p){
		this.p=p;
	}
	
	
	public void run() {
		System.out.println(Thread.currentThread().getName()+"child Started");
		p.printmsg();
		System.out.println(Thread.currentThread().getName()+"child finished");
	}
	
}
class PrintMessage2{
	 void printmsg() {
		System.out.println("started printing===========================");
		synchronized(this) {
		for(int i=0;i<10;i++)
		{
			try {
				Thread.sleep(200);
			}catch(InterruptedException e) {}
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
	}}
}