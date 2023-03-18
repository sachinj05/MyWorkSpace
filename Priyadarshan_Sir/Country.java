package Priyadarshan_Sir;
import java.util.Objects;
import java.util.TreeSet;
public class Country implements Comparable {
	String name;
	String pm;
	public Country(String name, String pm) {
		this.name = name;
		this.pm = pm;
	}
	public String toString() {
		return name + " " + pm ;
	}
	public int hashCode() {
		int n = Objects.hash(name,pm);
		return n;
	}
	public boolean equals(Object o) {
		Country c = (Country) o;
		if (this.name==c.name && this.pm==c.pm)
			return true;
		else
			return false;
	}
	public int compareTo(Object o) {
		Country c = (Country) o;
		int n = this.name.compareTo(c.name);
		return n;
	}
	public static void main(String[] args) {
		TreeSet<Country> ts = new TreeSet<>();
		ts.add(new Country("a","b"));
		ts.add(new Country("c","d"));
		ts.add(new Country("g","h"));
		ts.add(new Country("e","f"));
		ts.add(new Country("a","k"));
		System.out.println(ts);
	}
	
	

}
