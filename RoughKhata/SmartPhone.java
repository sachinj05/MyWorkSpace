package RoughKhata;

import java.util.ArrayList;

public class SmartPhone {
	String brand;
	int ram;

	public SmartPhone(String brand, int ram) {
		this.brand = brand;
		this.ram = ram;
	}

	public String toString() {
		return brand;
	}

	public static void main(String[] args) {
		ArrayList<SmartPhone> al = new ArrayList<>();

		al.add(new SmartPhone("Samsung", 12));
		al.add(new SmartPhone("Xiaomi", 8));
		al.add(new SmartPhone("Realme", 8));
		al.add(new SmartPhone("Nokia", 4));

		for (SmartPhone s : al) {
			System.out.println(s.brand);
			System.out.println(s.ram);
			System.out.println("-----------");
		}

	}

}
