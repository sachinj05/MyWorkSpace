package RoughKhata;

import java.util.Objects;

public class Country2 {
	String name;
	String pm;

	public Country2(String name, String pm) {
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
		Country2 c = (Country2) o;
		if (this.name == c.name && this.pm == c.pm)
			return true;
		else
			return false;
	}

	public int compareTo(Object o) {
		Country2 c = (Country2) o;
		int n = this.name.compareTo(c.name);
		return n;
	}

}
