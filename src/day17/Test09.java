package day17;

import java.util.ArrayList;
import java.util.Scanner;

class Member02{
	private String id;
	public void setId(String id) {
		this.id = id;
	}
	public String getId() {
		return id;
	}
}
public class Test09 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		ArrayList<Member02> arrMem = new ArrayList<Member02>();
		Member02 mem = new Member02();
		System.out.print("ȸ�� ���̵� �Է� : ");
		mem.setId(input.next());
		arrMem.add(mem);
		System.out.println("�Է��Ͻ� ȸ�� ���� : " + arrMem.get(0));

	}

}
