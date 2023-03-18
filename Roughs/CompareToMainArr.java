package Roughs;

import java.util.Arrays;

public class CompareToMainArr {
	public static void main(String[] args) {
		Laptop[] l = new Laptop[4];

		l[0] = new Laptop("Hp", 8);
		l[1] = new Laptop("Lenovo", 32);
		l[2] = new Laptop("Asus", 24);
		l[3] = new Laptop("Apple", 16);
		
		Arrays.sort(l);
		
		System.out.println(Arrays.toString(l));

	}

}
