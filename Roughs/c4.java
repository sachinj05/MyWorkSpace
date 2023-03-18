package Roughs;

public class c4 {
	public static void main(String[] args) {
		System.out.println(pow(5, 2));
	}

	private static int pow(int n, int p) {
		int power = 1;
		do {
			power*=n;
			p--;
			

		} while (p != 0);

		return power;
	}

}
