package threadtest;

public class SleepTest implements Runnable{
	public void run(){
		for(int i=0;i<10;i++){
			try{
				Thread.sleep(2000);
			}catch(Exception e){
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName());
		}
	}

	public static void main(String[] args){
		SleepTest test = new SleepTest();
		Thread demo = new Thread(test,"线程");
		demo.start();
	}
}
