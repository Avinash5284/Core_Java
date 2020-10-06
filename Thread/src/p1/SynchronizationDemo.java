package p1;

public class SynchronizationDemo {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName()+"Main Started");
		PrintMessage1 pm=new PrintMessage1();
		Myrunnable6 m=new Myrunnable6(pm);
		Thread th1=new Thread(m);
		Thread th2=new Thread(m);
		th1.start();
		th2.start();
		System.out.println(Thread.currentThread().getName()+"Main Finished");
	}

}
class Myrunnable6 implements Runnable{
	PrintMessage1 p;
	
	Myrunnable6(PrintMessage1 p){
		this.p=p;
	}
	
	
	public void run() {
		System.out.println(Thread.currentThread().getName()+"child Started");
		p.printmsg();
		System.out.println(Thread.currentThread().getName()+"child finished");
	}
	
}
class PrintMessage1{
	synchronized void printmsg() {
		System.out.println("started printing===========================");
		for(int i=0;i<10;i++)
		{
			try {
				Thread.sleep(200);
			}catch(InterruptedException e) {}
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
	}
}