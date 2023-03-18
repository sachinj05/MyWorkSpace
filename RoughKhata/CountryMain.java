package RoughKhata;

import java.util.HashSet;
//Remove duplicate by overriding equals and hashCode method

public class CountryMain {
	public static void main(String[] args) {
		HashSet<Country> hs = new HashSet<>();
		
		hs.add(new Country("India","Modi"));
		hs.add(new Country("Usa","Joe"));
		hs.add(new Country("Korea","Kim"));
		hs.add(new Country("Russia","Putin"));
		hs.add(new Country("Chaina"," Jinping"));
		hs.add(new Country("Japan"," Kishida"));
		hs.add(new Country("India","Modi"));
		
		
		System.out.println(hs);
	}
}
