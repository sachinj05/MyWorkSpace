package Roughs;

import java.util.ArrayList;
import java.util.ListIterator;

public class CollectionDemo {

	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		ArrayList b = new ArrayList();

		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(5);
		a.add(6);
		
		b.add(1);
		b.add(2);
		b.add(5);
		b.add(8);
		
		System.out.println(a);
		ListIterator i = a.listIterator();
		
		while(i.hasNext()) {
			System.out.print(i.next()+" ");
		}
		System.out.println();
		System.out.println(i.hasPrevious());
		System.out.println(i.previous());
		System.out.println(i.previous());
		System.out.println(i.previous());
		System.out.println(i.previous());
		System.out.println(i.previous());
		System.out.println(i.previous());
		
		System.out.println(i.hasPrevious());
	}

}
