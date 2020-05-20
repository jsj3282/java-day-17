package day17;

import java.io.File;
import java.io.IOException;

public class Test14 {

	public static void main(String[] args) throws IOException {
		
		File dir1 = new File("c:");
		File dir2 = new File("test");
		File file = new File(dir1 + File.separator + dir2 + File.separator + "aaa.txt");
		if(file.createNewFile()) {
			System.out.println("aaa.txt ÆÄÀÏ ¸¸µë");
		}
		System.out.println(file.getPath());
	}

}
