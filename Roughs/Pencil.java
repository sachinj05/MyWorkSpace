package Roughs;

import java.util.ArrayList;

public class Pencil {
	String brand;
	String color;
	
	public Pencil(String brand,String color) {
		this.brand = brand;
		this.color = color;
	}
	
	public String toString() {
		return brand;
	}
	
	public static void main(String[] args) {
		ArrayList<Pencil> al = new ArrayList();
		//ArrayList al = new ArrayList();
		
		al.add(new Pencil("Apsara","Dark Black"));
		al.add(new Pencil("Natraj","Dark Red"));
		al.add(new Pencil("Cello","Dark Blue"));
		
		
		for (Pencil p : al) {
			System.out.println(p.brand);
			System.out.println(p.color);
		}
		
		
//		Object o = al.get(2);
//		Pencil p = (Pencil)o;
//		
//		
//		System.out.println(p.brand);
//		System.out.println(p.color);
		
	}
	
	
	

}
