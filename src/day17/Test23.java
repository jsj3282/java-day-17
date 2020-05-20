package day17;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test23 {

	public static void main(String[] args) throws IOException {
		
		File f = new File("C:\\12월취업반정선주\\aaa.jpg");
		FileInputStream fis = new FileInputStream(f);
		BufferedInputStream bis = new BufferedInputStream(fis);
		int fsize = (int)f.length();
		
		System.out.println("fsize : " + fsize);
		
		byte b[] = new byte[fsize];
		bis.read();
		bis.close();
		fis.close();
		
		FileOutputStream fos = new FileOutputStream("C:\\12월취업반정선주\\aaa.txt");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		bos.write(b);
		bos.flush();
		bos.close();
		fos.close();

	}

}
