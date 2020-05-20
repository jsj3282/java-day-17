package day17;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Test16 {

	public static void main(String[] args) throws IOException {
		
		Scanner input = new Scanner(System.in);
		File file = new File("C:\\12월취업반정선주\\java_workspace\\abcd1234");
		//File f = new File("C:\\12월취업반정선주\\java_workspace\\abcd1234");
		file.mkdir();
		File f = new File("C:\\12월취업반정선주\\java_workspace\\abcd1234\\aaa.txt");
		FileOutputStream fos = new FileOutputStream(f);
		String name, age, addr;
		String a = "=== 파일 저장값 === \n";
		fos.write(a.getBytes());
		System.out.print("이름 : ");
		name = "이름 : " + input.nextLine() + "\r\n";
		fos.write(name.getBytes());
		System.out.print("나이 : ");
		age = "나이 : " + input.nextLine() + "\r\n";
		fos.write(age.getBytes());
		System.out.print("주소 : ");
		addr = "주소 : " + input.nextLine() + "\r\n";
		fos.write(addr.getBytes());
	}

}
