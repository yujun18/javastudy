package IOtest;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamTest {

	public static void main(String[] args) throws IOException{
	InputStream yu = new FileInputStream("F:/11.txt");
	byte[] buffer = new byte[100];
	int length = 0 ;
	while((length = yu.read(buffer,0,buffer.length))!=-1){
		String str = new String(buffer,0,length);
		System.out.println(str);
	}
}
}
