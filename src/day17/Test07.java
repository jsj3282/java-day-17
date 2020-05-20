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
		mem1.setId("홍길동");
		Member01 mem2 = new Member01();
		System.out.print("아이디 입력 : ");
		id = input.next();
		mem2.setId(id);
		if(mem1.equals(mem2)==true) {
			System.out.println("존재하는 아이디 입니다.");
		}else {
			System.out.println("사용 가능한 아이디 입니다.");
		}
		
		

	}

}
