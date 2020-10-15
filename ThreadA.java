package okk;

public class ThreadA extends Thread{
public void run()
{
	System.out.println("mythread");
}
}
 class ThreadC{
	public static void main(String[] args) {
		ThreadA mat=new ThreadA();
		mat.run();
	}
}
