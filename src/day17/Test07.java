package day17;

import java.util.Scanner;

class Member01{
	private String id;
	public void setId(String id) {
		this.id = id;
	}
	public String getId() {
		return id;
	}
	public boolean equals(Object obj) {
		if(obj.equals(id)==true) {
			return true;
		}else return false;
	}
}
public class Test07 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String id;
		Member01 mem1 = new Member01();
		mem1.setId("ȫ�浿");
		Member01 mem2 = new Member01();
		System.out.print("���̵� �Է� : ");
		id = input.next();
		mem2.setId(id);
		if(mem1.equals(mem2)==true) {
			System.out.println("�����ϴ� ���̵� �Դϴ�.");
		}else {
			System.out.println("��� ������ ���̵� �Դϴ�.");
		}
		
		

	}

}
