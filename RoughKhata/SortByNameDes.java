package RoughKhata;

import java.util.Comparator;

public class SortByNameDes implements Comparator{
	
	public int compare(Object o1,Object o2) {
		Cosmetics c1 = (Cosmetics) o1;
		Cosmetics c2 = (Cosmetics) o2;
		
		int n = c1.name.compareTo(c2.name);
		return -n;
	}

}
