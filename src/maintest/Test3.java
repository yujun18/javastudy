package maintest;

public class Test3 {

	public static void main(String[] args){
		for(int i=100;i<=999;i++){
				
			int a = i/100;
			int b = i-a*100;
			int c = b/10;
			int d = b-c*10;
			
			if((a*a*a+c*c*c+d*d*d)==i){
				System.out.println(i);
			}
		}
		
	}
	
}
