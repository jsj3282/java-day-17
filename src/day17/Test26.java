package day17;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Test26 {

	public static void main(String[] args) throws IOException {
		
		FileWriter fos = new FileWriter("C:\\12�������������\\aaa.txt");
		BufferedWriter bos = new BufferedWriter(fos);
		PrintWriter pw = new PrintWriter(bos);
		
		pw.println("�ȳ��ϼ���!!!");
		pw.print("�ݰ��׿�!!!");
		
		pw.close();
	}

}
