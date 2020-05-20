package day17;

import java.io.File;
import java.io.IOException;

public class Test13 {

	public static void main(String[] args) throws IOException {
		
		File dir1 = new File("c:");
		File dir2 = new File("test");
		File file = new File(dir1 + File.separator + dir2 + File.separator + "aaa.txt");
		
		System.out.println(file.createNewFile());
		
		//다 같은 방식임
		File dir = new File("D:\\TEST");
		File file1 = new File("D:\\TEST\\AAA.TXT");
		File file2 = new File("D:\\TEST", "AAA.TXT");
		File file3 = new File(dir, "aaa.txt");
	}

}
