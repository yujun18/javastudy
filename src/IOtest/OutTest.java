package IOtest;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutTest {
	
	public static void main(String[] args) throws IOException{
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		String output = "dasha shichenlu";
		byte[] buffer = output.getBytes();
		bos.write(buffer);
		OutputStream os = new FileOutputStream("F:/12.txt");
		bos.writeTo(os);
	}
	
}
