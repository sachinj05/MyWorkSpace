package Roughs;

import java.util.ArrayList;
import java.util.Collections;

public class ComparatorArraylist {
	public static void main(String[] args) {
		ArrayList <Car> al = new ArrayList<>();
		
		al.add(new Car("Tesla", 9));
		al.add(new Car("Maruti", 2));
		al.add(new Car("Audi", 5));
		al.add(new Car("Rols", 8));
		
		System.out.println(al);
		Collections.sort(al, new SortBrand());
		System.out.println(al);
		Collections.sort(al, new SortPrice());
		System.out.println(al);
		
		
	}

}
