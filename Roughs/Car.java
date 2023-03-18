package Roughs;

public class Car {
	String brand;
	int price;
	@Override
	public String toString() {
		return brand + " " + price ;
	}
	public Car(String brand, int price) {
		this.brand = brand;
		this.price = price;
	}

}
