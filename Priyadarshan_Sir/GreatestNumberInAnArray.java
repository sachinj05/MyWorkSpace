package Priyadarshan_Sir;

public class GreatestNumberInAnArray {
	public static void main(String[] args) {
		int[] arr = {77,41,183,37,205,20};
		int x = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > x) {
				x = arr[i];

			}
		}
		System.out.println(x);
	}
}
