package day17;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

class FileClass implements Serializable{
	private int x, y, z;
	public void display() {
		System.out.println("x : " + x);
		System.out.println("y : " + y);
		System.out.println("z : " + z);
	}
}
public class Test30 {

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		
		FileClass fc = new FileClass();
		File f = new File("C:\\12월취업반정선주\\aaa.txt");
		FileInputStream fis = new FileInputStream(f);
		BufferedInputStream bis = new BufferedInputStream(fis);
		ObjectInputStream ois = new ObjectInputStream(bis);
		Object obj = ois.readObject();
		fc = (FileClass)obj;
		ois.close();
		fc.display();
	}

}
