package RoughKhata;

import java.util.Comparator;

public class SortByPriceAsc implements Comparator {
	@Override
	public int compare(Object o1, Object o2) {
		Cosmetics c1 = (Cosmetics) o1;
		Cosmetics c2 = (Cosmetics) o2;

		if (c1.price == c2.price)
			return 0;
		else if (c1.price > c2.price)
			return 1;
		else
			return -1;

	}

}
