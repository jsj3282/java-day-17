package day17;

import java.util.Scanner;

class Member{
	private String id;
	public void setId(String id) {
		this.id = id;
	}
	public String getId() {
		return id;
	}
}
public class Test06 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String id;
		Member mem1 = new Member();
		mem1.setId("ȫ�浿");
		Member mem2 = new Member();
		id = input.next();
		mem2.setId(id);
		if(mem1.equals(mem2)==true) {
			System.out.println("�����ϴ� ���̵� �Դϴ�.");
		}else {
			System.out.println("��� ������ ���̵� �Դϴ�.");
		}

	}

}
