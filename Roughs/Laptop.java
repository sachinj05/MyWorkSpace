package Roughs;


public class Laptop implements Comparable {
	String brand;
	int ram;
	public Laptop(String brand,int ram) {
		this.brand = brand;
		this.ram = ram;
	}
	
	public String toString() {
		return brand+"  "+ram;
	}

	@Override
	public int compareTo(Object o) {
		Laptop l = (Laptop) o;
		
		if (this.ram == l.ram) {
			return 0;
		}
		else if (this.ram > l.ram) {
			return 1;

		}
		else {
			return -1;
		}
		
	}
}
