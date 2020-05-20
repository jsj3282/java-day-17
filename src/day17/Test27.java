package day17;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Test27 {

	public static void main(String[] args) throws IOException {
		
		FileReader fr = new FileReader("C:\\12월취업반정선주\\aaa.txt");
		BufferedReader br = new BufferedReader(fr);
		
		while(true) {
			String msg = br.readLine();
			if(msg == null) {
				break;
			}
			System.out.println(msg);
		}

	}

}
