public class MainApplication {

	public static void main(String[] args) {
		CarDealership d = new CarDealership();
		d.CarFactory();
		d.ReportOnCars();
	}
}

class CarDealership {
	Car[] cars = new Car[5];

	public void CarFactory() {
		// Design Pattern: Object Factory
		cars[0] = new Car("BMW", "BLUE", "2019");
		cars[1] = new Car("Benz", "RED", "2017");
		cars[2] = new Car("Mazda", "GREY", "2016");
		cars[3] = new Car("Maserati", "Yellow", "2020");
		cars[4] = new Car("Ford", "Black", "2014");
	}

	public void ReportOnCars() {
		for (int counter = 0; counter < cars.length; counter++) {
			System.out.println(cars[counter]);
		}
	}
}

class Car {
	public Car(String _model, String _color, String _year) {
		this.model = _model;
		this.color = _color;
		this.year = _year;
	}
	
	public String toString() {
		return this.model + "\t" + this.color + "\t" + this.year + "\r\n";  
	}

	String model;
	String color;
	String year;
	int currentSpeed = 0;

	public void changeSpeed(int speedChangeAmount) {
		this.currentSpeed += speedChangeAmount;
	}

}
