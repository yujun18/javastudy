package maintest;

public class RoundTest {

	public static void main(String[] args){
		
	}
	
	public static boolean isBoom(int x1,int y1,int x2,int y2,int r1,int r2){
		boolean flag = true;
		int x=x2-x1;
		int y=y2-y1;
		int r=(int) Math.sqrt(x*x+y*y);
		int r3=r1+r2;
		if(r>r3){
			flag=false;
		}
		return flag;
	}
}
