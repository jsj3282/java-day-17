package day17;

import java.util.ArrayList;
import java.util.Scanner;

class Member03{
	
	private String id;
	public void setId(String id) {
		this.id = id;
	}
	public String getId() {
		return id;
	}
	public String toString() {
		return id;
	}
}
public class Test10 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		ArrayList<Member03> arrMem = new ArrayList<>();
		Member03 mem = new Member03();
		System.out.print("회원 아이디 입력 : ");
		mem.setId(input.next());
		arrMem.add(mem);
		System.out.println("입력하신 회원 정보 : " + arrMem.get(0));
	}

}
