package class3;

class Car {
	public String brand;
	public String model;
	public String name;
	public String engineType;
	public int price;

	public Car(String brand, String model, String name, String engineType, int price) {
		this.brand = brand;
		this.model = model;
		this.name = name;
		this.engineType = engineType;
		this.price = price;
	}

	public Car(Car carObj, int price) {
		this.brand = carObj.brand;
		this.name = carObj.name;
		this.model = carObj.model;
		this.engineType = carObj.engineType;
		this.price = price;
	}

	public Car(Car carObj, String brand) {
		this.brand = brand;
		this.name = carObj.name;
		this.model = carObj.model;
		this.engineType = carObj.engineType;
		this.price = carObj.price;
	}

	public void print() {
		System.out.println("brand=" + brand + " model=" + model + " name=" + name + " EngineType=" + engineType
				+ " price=" + price);
	}
}

public class demo4 {

	public static void main(String[] args) {
		Car car = new Car("Benz", "Ultra", "something", "diesel", 100000);
		Car car1 = new Car(car, 200000);
		Car car2 = new Car(car, "Audi");

		car.print();
		car1.print();
		car2.print();

		// TODO Auto-generated method stub

	}

}
