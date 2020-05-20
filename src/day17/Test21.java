package day17;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test21 {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream fos = new FileOutputStream("C:\\12월취업반정선주\\aaa.txt");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		for(int i = '1'; i<='9'; i++) {
			bos.write(i);
		}
		bos.close();		//언제 끝나는지 알려줘야 파일로 전송
	}

}
