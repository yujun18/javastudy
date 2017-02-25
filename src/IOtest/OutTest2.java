package IOtest;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutTest2 {
	public static void main(String[] args) throws IOException{
		OutputStream os = new FileOutputStream("F:/12.txt",true);
		String output = "xiaoshi,ni ga sha zi";
		byte[] buffer = output.getBytes();
		os.write(buffer);
		os.close();
	}
}
