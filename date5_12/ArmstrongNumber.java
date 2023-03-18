package date5_12;
import java.util.Scanner;
public class ArmstrongNumber {
	static int countDigit(int n) {
		int count = 0;

		while (n != 0) {
			count++;
			n = n / 10;
		}
		return count;
	}

	static int toThePower(int x, int z) {
		int pow = 1;
		while (z != 0) {
			pow *= x;
			z--;
		}
		return pow;
	}
	static boolean isArmstrong(int x) {
		int temp = x;
		int sum = 0;
		int z = countDigit(x);
		while (x != 0) {
			int d = x % 10;
			sum = sum + toThePower(d, z);
			x = x / 10;
		}
		return sum == temp;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean rs = isArmstrong(n);
		if (rs)
			System.out.println(n + " is an Armstrong");
		else
			System.out.println(n + " is not an Armstrong");
	}
}
