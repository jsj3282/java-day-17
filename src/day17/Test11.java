package day17;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Test11 {

	public static void main(String[] args) throws IOException {
		
		Scanner input = new Scanner(System.in);
		File filePath = new File("C:\\12�������������\\java_workspace\\aaa.txt");
		FileOutputStream fos = new FileOutputStream(filePath);
		
		fos.write(97);
		fos.write('A');			//byte ������ ���
		
		String str;
		System.out.print("���Ϸ� ������ �� �Է� : ");
		str = input.nextLine();
		fos.write(str.getBytes());

	}

}
