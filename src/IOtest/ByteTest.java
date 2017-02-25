package IOtest;

import java.io.ByteArrayInputStream;

public class ByteTest {

	public static void main(String[] args){
		String input = "i love you";
		byte[] b = input.getBytes();
		ByteArrayInputStream bis = new ByteArrayInputStream(b);
		for(int i=0;i<input.length();i++){
			int c;
			while((c=bis.read())!=-1){
				System.out.print((char)c);
			}
		}
		bis.reset();
	}
}
