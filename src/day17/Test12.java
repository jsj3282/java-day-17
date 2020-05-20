package day17;

import java.io.File;
import java.io.IOException;

public class Test12 {

	public static void main(String[] args) throws IOException {
		System.out.println("폴더 구별자 : " + File.separator);	//리턴타입 : String
		System.out.println("폴더 구별자 : " + File.separatorChar); //리턴타입 : Char
		System.out.println("path 구별자 : " + File.pathSeparator);
		System.out.println("path 구별자 : " + File.pathSeparatorChar);

	}

}
