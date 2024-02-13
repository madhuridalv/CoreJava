package multithreading1;

public class MyThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadDemo thread1 = new ThreadDemo(5, "Madhuri");
		ThreadDemo thread2 = new ThreadDemo(2, "hello");
		
		thread1.start();
		thread2.start();
		
		System.out.println("End of the main thread....");

	}

}
