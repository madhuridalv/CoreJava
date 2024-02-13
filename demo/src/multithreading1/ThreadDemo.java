package multithreading1;

public class ThreadDemo extends Thread {
	
	private int  n;
	public String name;
		
	
	
	public ThreadDemo(int n, String name) {
		// TODO Auto-generated constructor stub
		this.n = n;
		this.name = name;
	}
	
	
	@Override
	public void run() {
		
		
		for(int i=1;i<=n;i++)
		{
			
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				System.err.println("Thread Interrupted.."+ e.getMessage());
			}
		System.out.println(name + i );
		System.out.println(Thread.currentThread().getName());
		}
	}

}
