package day17;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Test11 {

	public static void main(String[] args) throws IOException {
		
		Scanner input = new Scanner(System.in);
		File filePath = new File("C:\\12월취업반정선주\\java_workspace\\aaa.txt");
		FileOutputStream fos = new FileOutputStream(filePath);
		
		fos.write(97);
		fos.write('A');			//byte 단위로 출력
		
		String str;
		System.out.print("파일로 저장할 값 입력 : ");
		str = input.nextLine();
		fos.write(str.getBytes());

	}

}
