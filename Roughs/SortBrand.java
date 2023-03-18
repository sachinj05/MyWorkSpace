package Roughs;

import java.util.Comparator;

public class SortBrand implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Car c1 = (Car) o1;
		Car c2 = (Car) o2;
		int n = c1.brand.compareTo(c2.brand);
		return n;
	}

}
