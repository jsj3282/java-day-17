package day17;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Test16 {

	public static void main(String[] args) throws IOException {
		
		Scanner input = new Scanner(System.in);
		File file = new File("C:\\12�������������\\java_workspace\\abcd1234");
		//File f = new File("C:\\12�������������\\java_workspace\\abcd1234");
		file.mkdir();
		File f = new File("C:\\12�������������\\java_workspace\\abcd1234\\aaa.txt");
		FileOutputStream fos = new FileOutputStream(f);
		String name, age, addr;
		String a = "=== ���� ���尪 === \n";
		fos.write(a.getBytes());
		System.out.print("�̸� : ");
		name = "�̸� : " + input.nextLine() + "\r\n";
		fos.write(name.getBytes());
		System.out.print("���� : ");
		age = "���� : " + input.nextLine() + "\r\n";
		fos.write(age.getBytes());
		System.out.print("�ּ� : ");
		addr = "�ּ� : " + input.nextLine() + "\r\n";
		fos.write(addr.getBytes());
	}

}
