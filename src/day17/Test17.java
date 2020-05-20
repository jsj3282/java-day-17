package day17;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test17 {

	public static void main(String[] args) throws IOException {
		
		File dir1 = new File("c:");
		File dir2 = new File("12월취업반정선주");
		File file = new File(dir1 + File.separator + dir2 + File.separator + "aaa.txt");
		FileOutputStream fos = new FileOutputStream(file);
		fos.write(97);	
		FileInputStream fis = new FileInputStream(file);
		while(true) {
			int res = fis.read();
			if(res<0) {
				break;
			}
			System.out.println(res);
		}

	}

}
