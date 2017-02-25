package threadtest;

public class RunnableTest3 implements Runnable{
	public void run(){
		for(int i=0;i<3;i++){
			System.out.println(Thread.currentThread().getName());
		}
	}
	
	public static void main(String[] args){
		RunnableTest3 test = new RunnableTest3();
		Thread demo = new Thread(test,"线程");
		demo.start();
		for(int i=0;i<50;++i){
			if(i>10){
				try{
					//demo.start();
					demo.join();
				}catch(Exception e){
					e.printStackTrace();
				}
			}
			System.out.println("main主线程执行"+i);
		}
	}

}
