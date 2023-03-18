package collection_Durga_Sir;

import java.util.Comparator;

public class MyComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
//		Integer i1 = (Integer) o1;
//		Integer i2 = (Integer) o2;
		String i1 = (String) o1;
		String i2 = o2.toString();

//		if (i1>i2)
//			return -1;
//			
//		else if(i1<i2)
//			return 1;
//		else
//			return 0;
//		return i1.compareTo(i2);
//		return -i1.compareTo(i2);
		return i2.compareTo(i1);
//  	return -i2.compareTo(i1);
//		return 0;
//		return 1;		//insertion order
//		return -1;		//reverse insertion order

	}

}
