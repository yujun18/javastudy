package threadtest;

public class TongBuTest implements Runnable{
	private int count = 5;
	public void run(){
		for(int i=0;i<10;++i){
			synchronized(this){
				if(count>0){
					try{
						Thread.sleep(1000);
					}catch(InterruptedException e){
						e.printStackTrace();
					}
					System.out.println(count--);
				}
			}
		}
	}
	
	public static void main(String[] args){
		TongBuTest test = new TongBuTest();
		Thread demo1 = new Thread(test);
		Thread demo2 = new Thread(test);
		Thread demo3 = new Thread(test);
		demo1.start();
		demo2.start();
		demo3.start();
	}

}
