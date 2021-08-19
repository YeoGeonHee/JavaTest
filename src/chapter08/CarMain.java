package chapter08;

public class CarMain {

	public static void main(String[] args) {
		//현대, 기아
		Car hCar = new Car();
		Car kCar = new Car();
		Car[] cars = new Car[2];
		
		cars[0] = hCar;
		cars[1] = kCar;
		
		hCar.company = "현대";
		kCar.company = "기아";
		hCar.color = "white";
		kCar.color = "black";
		
		
		hCar.go();
		kCar.back();
		
		System.out.println();

	}

}
