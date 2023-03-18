package Roughs;

import java.util.HashSet;
import java.util.Objects;

//remove duplicate in hashSet by overriding hashCode & boolean equals
public class Country {
	String name;
	String pm;
	public Country(String name, String pm) {
		this.name = name;
		this.pm = pm;
	}
	public String toString() {
		return name+" "+pm;
	}
	
	public int hashCode() {
		int n = Objects.hash(name,pm);
		return n;
	}
	
	public boolean equals(Object o) {
		Country c = (Country) o;
		if (this.name==c.name && this.pm==c.pm) {
			return true;
		}else
			return false;
		
	}
	
	public static void main(String[] args) {
		HashSet<Country> hs = new HashSet<>();
		hs.add(new Country("a","b"));
		hs.add(new Country("c","d"));
		hs.add(new Country("g","h"));
		hs.add(new Country("e","f"));
		hs.add(new Country("g","h"));
		System.out.println(hs);

		
		
	}

}
