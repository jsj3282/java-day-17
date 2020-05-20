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
			System.out.println("firstCar와 secondCar는 하나의 Car 입니다.");
		}else {
			System.out.println("firstCar와 secondCar는 서로 다른 Car 입니다.");
		}
		System.out.println(firstCar);
		System.out.println(secondCar);
	}

}
