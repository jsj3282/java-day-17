package day17;

import java.util.ArrayList;

public class Test02 {

	public static void main(String[] args) {
		
		ArrayList arr = new ArrayList();
		arr.add(123);
		arr.add("456");
		arr.add(1.123);
		Object ob01 = arr.get(0);
		Object ob02 = arr.get(1);
		Object ob03 = arr.get(2);
		System.out.println(ob01.getClass());
		System.out.println(ob02.getClass());
		System.out.println(ob03.getClass());

	}

}
