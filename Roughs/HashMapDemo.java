package Roughs;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapDemo {
	public static void main(String[] args) {
		HashMap m = new HashMap<>();
		m.put("sachin", 1);
		m.put("viku", 2);
		m.put("smruti", 3);
		m.put("tapas", 4);
		m.put("kanhei", 5);
		System.out.println(m);
		System.out.println(m.keySet());
		System.out.println(m.values());
		System.out.println(m.entrySet());
		Iterator itr = m.entrySet().iterator();
		System.out.println("-----------------------------------------------");
		while (itr.hasNext()) {
			Map.Entry m1 = (Map.Entry) itr.next();
			System.out.println(m1);

			if (m1.getKey().equals("smruti")) {
				m1.setValue(33);
			}
		}
		System.out.println(m);

	}
}



