package maintest;

public class Test2 {

	public static void main(String[] args){
		int m=200;
		int count=0;
		for(int j=101;j<=m;j++){
		if(isSuShu(j)){
			count++;
		}else{
			continue;
		}
		}
		System.out.print(count);
	}
	
	public static boolean isSuShu(int n){
		boolean b = true;
		if(n==1||n==2){
			b=true;
		}
		for(int i=2;i<Math.sqrt(n);i++){
			if(n%i==0||n%i==1){
				b=false;
			}else{
				b=true;
			}
		}
		return b;
		
	}
}
