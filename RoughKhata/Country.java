package RoughKhata;

import java.util.Objects;
//Remove duplicate by overriding equals and hashCode method

public class Country {
	String name;
	String pm;

	public Country(String name, String pm) {
		this.name = name;
		this.pm = pm;
	}

	public String toString() {
		return name;
	}

	@Override
	public int hashCode() {
		int hc = Objects.hash(name, pm);
		return hc;
	}

	@Override
	public boolean equals(Object o) {
		Country c = (Country) o;
		if (this.name == c.name && this.pm == c.pm)
			return true;
		else
			return false;
	}

}
