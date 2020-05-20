package day17;
/*
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

class Member implements Serializable{
	private String stNum, stName, stJumsu;
	private int kor, eng, math;
	public String getStNum() {
		return stNum;
	}
	public void setStNum(String stNum) {
		this.stNum = stNum;
	}
	public String getStName() {
		return stName;
	}
	public void setStName(String stName) {
		this.stName = stName;
	}
	public String getStJumsu() {
		return stJumsu;
	}
	public void setStJumsu(String stJumsu) {
		this.stJumsu = stJumsu;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public boolean chkStNum(ArrayList<Member> arr) {
		for(Member m : arr) {
			if(getStNum().equals(this.stNum)==true) {
				return true;
			}
		}
		return false;
	}
	public boolean searchSt(ArrayList<Member> arr, String stNum) {
		for(Member m : arr) {
			if(m.getStNum().equals(stNum)==true){
				setStNum(stNum);
				setStName(m.getStName());
				setKor(m.getKor());
				setEng(m.getEng());
				setMath(m.getMath());
				setStJumsu(m.getStJumsu());
				return true;
			}
		}
		return false;
	}
}

class FileInOut{
	File dir;
	File f3;
	public FileInOut(String path) {
		dir = new File(path);
	}
	public void fileOut(Member outMember) throws IOException {
		f3 = new File(dir, outMember.getStNum()+".txt");
		FileOutputStream fos = new FileOutputStream(f3);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		oos.writeObject((Object)outMember);
		oos.close();
	}
	public Member fileRead(String stNum) throws ClassNotFoundException, IOException {
		Member mb = null;
		f3= new File(dir, stNum + ".txt");
		try {
			FileInputStream fis = new FileInputStream(f3);
			BufferedInputStream bis = new BufferedInputStream(fis);
			ObjectInputStream ois = new ObjectInputStream(bis);
			mb = (Member)ois.readObject();
			ois.close();
		}catch(FileNotFoundException e) {
			return null;
		}
		return mb;
	}
	public boolean chkFile(String stNum) throws IOException {
		File f3 = new File(dir, stNum + ".txt");
		if(f3.createNewFile()) {		//���� ������ �����ϸ� true
			return false;
		}
		return true;
	}
}
public class Test33 {

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		
		Scanner input = new Scanner(System.in);
		System.out.print("��� �Է� : ");
		String path = input.next();
		FileInOut outMember = new FileInOut(path);
		ArrayList<Member> arr = new ArrayList<Member>();
		String stNum, stName, stJumsu;
		int kor, eng, math, avr;
		int num;
		boolean bl;
		while(true) {
			System.out.println("1. �л� �˻�");
			System.out.println("2. ���");
			System.out.println("3. ����");
			System.out.print(">>> ");
			num = input.nextInt();
			Member mb = new Member();
			switch(num) {
			case 1:
				System.out.print("ã�� �л� �й� �Է� : ");
				stNum = input.next();
				bl = mb.searchSt(arr, stNum);
				mb = outMember.fileRead(stNum);
				if(bl == true || mb != null) {
					System.out.println("�й� : " + mb.getStNum());
					System.out.println("�̸� : " + mb.getStName());
					System.out.println("���� : " + mb.getKor());
					System.out.println("���� : " + mb.getEng());
					System.out.println("���� : " + mb.getMath());
					System.out.println("��� : " + mb.getStJumsu());
				}else {
					System.out.println("ã�� �л��� �����ϴ�!!!");
				}
				break;
			case 2:
				bl = true;
				while(bl) {
					System.out.print("�й� �Է� : ");
					stNum = input.next();
					mb.setStNum(stNum);
					bl = mb.chkStNum(arr);
					bl = outMember.chkFile(stNum);
					if(bl==true) {
						System.out.println("�����ϴ� �й� �Դϴ�");
						System.out.println("�ٽ� �Է� �ϼ���");
					}
				}
				System.out.print("�̸� �Է� : ");
				stName = input.next();
				System.out.print("���� ���� �Է� : ");
				kor = input.nextInt();
				System.out.print("���� ���� �Է� : ");
				eng = input.nextInt();
				System.out.print("���� ���� �Է� : ");
				math = input.nextInt();
				mb.setStName(stName);
				mb.setKor(kor);
				mb.setEng(eng);
				mb.setMath(math);
				avr =(kor + eng + math) / 3;
				if(avr>=90) {
					mb.setStJumsu("A");
				}else if(avr>=80) {
					mb.setStJumsu("B");
				}else if(avr>=70) {
					mb.setStJumsu("C");
				}else if(avr>=60) {
					mb.setStJumsu("D");
				}else {
					mb.setStJumsu("F");
				}
				arr.add(mb);
				outMember.fileOut(mb);
				System.out.println("���ԵǼ̽��ϴ�!!!");
				break;
			case 3:
				return;
			}
		}

	}

}
*/