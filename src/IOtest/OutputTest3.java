package IOtest;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputTest3 {
	public static void main(String[] args) throws IOException{
		
		try{
		DataOutputStream dos = new DataOutputStream(
				new BufferedOutputStream(new FileOutputStream("F:/11.txt")));
		byte a=1;
		char b='a';
		int c = 2;
		dos.write(a);
		dos.write(b);
		dos.write(c);
		dos.close();
		DataInputStream dis = new DataInputStream(
				new BufferedInputStream(new FileInputStream("F:/11.txt")));
		System.out.println(dis.readByte());
		System.out.println(dis.readChar());
		System.out.println(dis.readInt());
		dis.close();
		}catch(EOFException e){
			e.printStackTrace();
		}
	}
}
