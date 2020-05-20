package day17;

class Car02{
	private String model;
	public Car02(String model) {
		this.model = model;
	}
	public boolean equals(Object obj) {
		if(obj.equals(model)) {
			return true;
		}else return false;
	}
}
public class Test05 {

	public static void main(String[] args) {
		
		Car02 firstCar = new Car02("vm5");
		Car02 secondCar = new Car02("vm5");
		if(firstCar.equals(secondCar)) {
			System.out.println("같은 종류의 자동차입니다.");
		}else {
			System.out.println("다른 종류의 자동차입니다.");
		}
		System.out.println(firstCar);
		System.out.println(secondCar);
	}

}
