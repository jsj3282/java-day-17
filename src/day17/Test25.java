package day17;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test25 {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("C:\\12월취업반정선주\\aaa.txt");
		BufferedInputStream bis = new BufferedInputStream(fis);
		DataInputStream dis = new DataInputStream(bis);
		
		String name = dis.readUTF();
		int kor = dis.readInt();
		int eng = dis.readInt();
		System.out.println(name + "님의 성적 : " + (kor + eng));

	}

}
