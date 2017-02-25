package threadtest;

public class YelidTest implements Runnable{
	public void run(){
		for(int i=0;i<5;++i){
			System.out.println(Thread.currentThread().getName());
			if(i==3){
				System.out.println("线程的礼让");
				Thread.currentThread().yield();
			}
		}
	}
	
	public static void main(String[] args){
		YelidTest test = new YelidTest();
		Thread demo = new Thread(test,"A");
		Thread demo1 = new Thread(test,"B");
		demo.start();
		demo1.start();
	}

}
