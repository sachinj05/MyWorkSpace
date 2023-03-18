package Roughs;

import java.util.Objects;
public class Marker {
	String brand;
	String colour;
	public Marker(String brand, String colour) {
		this.brand = brand;
		this.colour = colour;
	}

	public String toString() {
		return brand + " " + colour;
	}

	public boolean equals(Object o) {
		Marker m = (Marker) o;
		if (this.brand == m.brand && this.colour == m.colour)
			return true;
		else
			return false;
		
	}
	
	public int hashCode() {
		int n = Objects.hash(brand,colour);
		return n;
	}

	public static void main(String[] args) {
		Marker m1 = new Marker("camlin", "black");
		Marker m2 = new Marker("camlin", "black");
		System.out.println(m1 == m2);
		System.out.println(m1.equals(m2));
		System.out.println(m1.toString());
		System.out.println("-----------");
		System.out.println(m1.hashCode());
		System.out.println(m2.hashCode());
	}
}
