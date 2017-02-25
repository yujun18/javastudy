package threadtest;


public class RunnableTest implements Runnable{
	
	private int ticket = 5;
	 public void run(){
		 for(int i=0;i<20;i++){
			 if(this.ticket>0){
				 System.out.println(Thread.currentThread().getName()+"正在卖票"+this.ticket--);
			 }
		 }
	 }
	 
	 //public class code{
		 public static void main(String [] args){
			 RunnableTest yu = new  RunnableTest();
			 new Thread(yu,"1号窗口").start();
			 new Thread(yu,"2号窗口").start();
			 new Thread(yu,"3号窗口").start();
		 }
	 //}

}
