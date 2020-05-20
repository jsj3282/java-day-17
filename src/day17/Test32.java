package day17;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

class A10 implements Serializable{
	private int a;
	private int b;
	public A10(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public void setA(int a) {
		this.a = a;
	}
	public void setB(int b) {
		this.b = b;
	}
	public int getA() {
		return a;
	}
	public int getB() {
		return b;
	}
}
public class Test32 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		File dir = new File("C:\\12월취업반정선주");
		File f3 = new File(dir, "aaa.txt");
		
		FileInputStream fis = new FileInputStream(f3);
		BufferedInputStream bis = new BufferedInputStream(fis);
		ObjectInputStream ois = new ObjectInputStream(bis);
		
		//Object obj = ois.readObject();
		//A10 ap = (A10)obj;
		A10 ap = (A10)ois.readObject();
		System.out.println("ap.a = " + ap.getA());
		System.out.println("ap.b = " + ap.getB());

	}

}
