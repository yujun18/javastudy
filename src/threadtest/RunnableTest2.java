package threadtest;

public class RunnableTest2 implements Runnable {
	public void run(){
		for(int i=0;i<3;i++){
			System.out.println(Thread.currentThread().getName());
		}
	}
	
	public static void main(String[] args){
		RunnableTest2 test = new RunnableTest2();
		new Thread(test,"A").start();
		new Thread(test,"B").start();
		new Thread(test).start();
	}

}
