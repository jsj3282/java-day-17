package day17;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Test18 {

	public static void main(String[] args) throws IOException {
		
		File dir1 = new File("c:");
		File dir2 = new File("12월취업반정선주");
		File file = new File(dir1 + File.separator + dir2 + File.separator + "aaa.txt");
		
		FileInputStream fis = new FileInputStream(file);
		while(true) {
			int res = fis.read();
			if(res < 0) {
				break;
			}
			System.out.println((char)res);
		}

	}

}
