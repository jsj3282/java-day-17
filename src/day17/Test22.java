package day17;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test22 {

	public static void main(String[] args) throws IOException {
		
		 FileOutputStream fos = new FileOutputStream("C:\\12월취업반정선주\\aaa.txt");
		 BufferedOutputStream bos = new BufferedOutputStream(fos);
		 
		 for(int i = '1'; i <= '9'; i++) {
			 bos.write(i);
		 }
		 bos.flush();
		 bos.write("중간에 추가하기".getBytes());
		 bos.close();
		 fos.close();
	}

}
