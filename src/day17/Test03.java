package day17;

class Car{
	private String model;
	public Car(String model) {
		this.model = model;
	}
}
public class Test03 {

	public static void main(String[] args) {
		
		Car firstCar = new Car("vm502");
		Car secondCar = new Car("vm502");
		if(firstCar.equals(secondCar)) {
			System.out.println("firstCar�� secondCar�� �ϳ��� Car�̴�");
		}else {
			System.out.println("firstCar�� secondCar�� ���� �ٸ� Car�̴�");
		}
		System.out.println(firstCar);
		System.out.println(secondCar);
	}

}
