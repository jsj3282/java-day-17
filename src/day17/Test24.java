package day17;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test24 {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream fos = new FileOutputStream("C:\\12�������������\\aaa.txt");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		DataOutputStream dos = new DataOutputStream(bos);
		
		dos.writeUTF("�谳��");
		dos.writeInt(100);
		dos.writeInt(80);
		
		dos.flush();
		dos.close();

	}

}
