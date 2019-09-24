package Thread;

///////////////////////////////////////////////////
public class ThreadLocalTest {
	public static void main(String[] args) {
		
		Mycount mycount = new Mycount();
		
		new MyThread(mycount).start();//start 方法会启动一个新的线程
		
		new MyThread(mycount).start();
		
		new MyThread(mycount).start();
		
		new MyThread(mycount).start();
		
	}
}

///////////////////////////////////////////////////
class Mycount{
	public static ThreadLocal<Integer> threadlocal = new ThreadLocal<Integer>() {

		@Override
		protected Integer initialValue() {
			
			
			return 0;
		};
	};
		public int nextValue() {
			threadlocal.set(threadlocal.get()+1);
			return threadlocal.get();
		}
}
///////////////////////////////////////////////////

class MyThread extends Thread{

	private Mycount mycount;
	
	public MyThread(Mycount mycount) {
		this.mycount = mycount;
	}

	public MyThread() {
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName()+"正在执行"+mycount.nextValue());
		}
	}
}
