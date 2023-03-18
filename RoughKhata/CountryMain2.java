package RoughKhata;

import java.util.TreeSet;

public class CountryMain2 {

	public static void main(String[] args) {
		
		TreeSet<Country2> ts = new TreeSet<>();
		
		ts.add(new Country2("India","Modi"));
		ts.add(new Country2("Usa","Joe"));
		ts.add(new Country2("Korea","Kim"));
		ts.add(new Country2("Russia","Putin"));
		ts.add(new Country2("Chaina"," Jinping"));
		ts.add(new Country2("Japan"," Kishida"));
		ts.add(new Country2("India","Modi"));		
		System.out.println(ts);

		
		
		
	}

}