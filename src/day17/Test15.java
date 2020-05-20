package day17;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Test15 {

	public static void main(String[] args) throws IOException {
		
		Scanner input = new Scanner(System.in);
		File dir1 = new File("c:");
		File dir2 = new File("test");
		File file = new File(dir1 + File.separator + dir2 + File.separator + "aaa.txt");
		
		FileOutputStream fos = new FileOutputStream(file, true);
		
		String str;
		System.out.print("파일 저장 값 입력 : ");
		str = input.nextLine();
		fos.write(str.getBytes());
	}

}
