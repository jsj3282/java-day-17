package day17;

class Car01{
	private String model;
	public Car01(String model) {
		this.model = model;
	}
}
public class Test04 {

	public static void main(String[] args) {
		
		Car01 firstCar = new Car01("vm502");
		Car01 secondCar = firstCar;
		if(firstCar.equals(secondCar)) {
			System.out.println("firstCar�� secondCar�� �ϳ��� Car �Դϴ�.");
		}else {
			System.out.println("firstCar�� secondCar�� ���� �ٸ� Car �Դϴ�.");
		}
		System.out.println(firstCar);
		System.out.println(secondCar);
	}

}
