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
		System.out.print("회원 아이디 입력 : ");
		mem.setId(input.next());
		arrMem.add(mem);
		System.out.println("입력하신 회원 정보 : " + arrMem.get(0));

	}

}
