package day17;

import java.io.File;
import java.io.IOException;

public class Test12 {

	public static void main(String[] args) throws IOException {
		System.out.println("���� ������ : " + File.separator);	//����Ÿ�� : String
		System.out.println("���� ������ : " + File.separatorChar); //����Ÿ�� : Char
		System.out.println("path ������ : " + File.pathSeparator);
		System.out.println("path ������ : " + File.pathSeparatorChar);

	}

}
