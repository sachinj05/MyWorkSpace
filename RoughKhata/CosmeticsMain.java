package RoughKhata;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CosmeticsMain {
	public static void main(String[] args) {
		ArrayList<Cosmetics> al = new ArrayList<>();
		
		al.add(new Cosmetics("a","e",200));
		al.add(new Cosmetics("d","h",100));
		al.add(new Cosmetics("c","g",300));
		al.add(new Cosmetics("b","f",250));
		
		System.out.println(al);
		
		Collections.sort(al, new SortByNameAsc());
		System.out.println(al);
		
		Collections.sort(al,new SortByPriceAsc());
		System.out.println(al);
		
		Collections.sort(al, new SortByNameDes());
		System.out.println(al);

		
		
	}

}
