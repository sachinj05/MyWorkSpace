package Roughs;

public class Laptops implements Comparable{

	String brand ;
	int ram;
	
	public Laptops (String brand ,int ram) {
		this.brand= brand;
		this.ram = ram;
	}
	
	public String toString() {
		return brand;
	}
	
	public int compareTo(Object o) {
		Laptops l = (Laptops) o;
		
		if (this.ram==l.ram)
			return 0;
		else if (this.ram>l.ram)
			return 1;
		else
			return -1;
		
		//return 	this.brand.compareTo(l.brand);
		
	}
}
