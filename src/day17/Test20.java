package day17;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test20 {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		FileOutputStream fos = new FileOutputStream("C:\\12�������������\\aaa.txt");
		for(int i = '1'; i <= '9'; i++) {
			Thread.sleep(3000);
			fos.write(i);
		}

	}

}
