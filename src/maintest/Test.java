package maintest;

public class Test {

	public static void main(String[] args){
		int n1=10;
		System.out.println("第十个月"+fun(n1));
	}
	
	public static  int fun(int n){
		if(n==1||n==2){
			return 1;
		}
		else{
			return fun(n-1)+fun(n-2);
		}
	}
	
}
