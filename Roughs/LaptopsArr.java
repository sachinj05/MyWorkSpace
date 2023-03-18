package Roughs;

import java.util.Arrays;

public class LaptopsArr {
	public static void main(String[] args) {
		Laptops[] l1 = new Laptops[3];
		
		
		l1[0]= new Laptops("Lenovo", 8);
		l1[1]= new Laptops("Hp", 32);
		l1[2]= new Laptops("Asus", 16);
		
		
		for (Laptops laptops : l1) {
			System.out.print(laptops +"  ");
		}
		System.out.println();
		Arrays.sort(l1);
		for (Laptops laptops : l1) {
			System.out.print(laptops +"  ");
		}
		
		
	}
	

}
