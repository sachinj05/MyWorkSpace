package collection_Durga_Sir;

import java.util.TreeSet;

public class ComparetorDemoStr {

	public static void main(String[] args) {
		TreeSet t = new TreeSet(new MyComparator());
		t.add("C");
		t.add("D");
		t.add("B");
		t.add("A");
		t.add("Z");
		System.out.println(t);

	}

}
