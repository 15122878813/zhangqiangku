package SingleTonExample;

//饿汉式单例模式,直接在本类进行new,在外界无法进行new,
class MyHungryModel{
	
	private static MyHungryModel myHungryModel = new MyHungryModel();
	
	private MyHungryModel() {
		
	}
	
	public static MyHungryModel getInstance(){
		
		return myHungryModel;
		
	}
}

class MyThread extends Thread{
	
	public MyThread() {
		
		System.out.println(MyHungryModel.getInstance().hashCode());
		
	}
	
}

public class HungryModel{
		
	public static void main(String[] args) {
		
		while (true) {
			
			new MyThread().start();
			
		}
	}
}