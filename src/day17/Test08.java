package day17;

class Car03{
	private String model;
	public Car03(String model) {
		this.model = model;
	}
	public String toString() {
		return "Car �𵨸� : " + model;
	}
}
public class Test08 {

	public static void main(String[] args) {
		
		Car03 obj = new Car03("����ī");
		System.out.println(obj.toString());
		System.out.println(obj);

	}

}
