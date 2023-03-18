package collection_Durga_Sir;

import java.util.TreeSet;

public class ComparetorDemo {

	public static void main(String[] args) {
		TreeSet t = new TreeSet(new MyComparator());
		t.add(10);
		t.add(0);
		t.add(5);
		t.add(30);
		t.add(20);
		System.out.println(t);

	}

}


