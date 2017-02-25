package threadtest;

public class TicketTest {

	public static void main(String[] args){
		Info info = new Info();
		Producer pro = new Producer(info);
		Consumer con = new Consumer(info);
		new Thread(pro).start();
		new Thread(con).start();
	}
}

class Info{
	private String name = "yujun";
	private int age = 24;
	private boolean flag = false;
	
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	
	public int getAge(){
		return age;
	}
	public void setAge(int age){
		this.age = age;
	}
	
	public synchronized void set(String name,int age){
		if(!flag){
			try{
				super.wait();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		this.name = name;
		try{
			Thread.sleep(100);
		}catch(Exception e){
			e.printStackTrace();
		}
		this.age = age;
		flag = false;
		super.notify();
	}
	
	public synchronized void get(){
		if(flag){
			try{
				super.wait();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		
		try{
			Thread.sleep(100);
		}catch(Exception e){
			e.printStackTrace();
		}
		System.out.println(this.getName()+"<===>"+this.getAge());
		flag = true;
		super.notify();
	}
}
class Producer implements Runnable{
	private Info info = null;
	Producer(Info info){
		this.info = info;
	}
	public void run(){
		boolean flag = false;
		for(int i=0;i<25;++i){
			if(flag){
				this.info.set("yujun", 24);
				flag = false;
			}else{
				this.info.set("shichenglu", 23);
				flag = true;
			}
		}
	}
}
class Consumer implements Runnable{
	private Info info = null;
	public Consumer(Info info){
		this.info = info;
	}
	public void run(){
		for(int i=0;i<25;++i){
			try{
				Thread.sleep(100);
			}catch(Exception e){
				e.printStackTrace();
			}
			this.info.get();
		}
	}
}
