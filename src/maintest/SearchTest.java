package maintest;

public class SearchTest {

	public static void main(String[] args) {

		int c= panduan(50,20,29);
		System.out.println(c);
	}

	public static int panduan(int max,int min,int a){
		
		while(min<=max){
		int b = (max+min)/2;
		if(a<b){
			max=b;
		}else if(a==b){
			return b;
		}
		else{
			min=b;
		}
		}
		return max;
	}
}
