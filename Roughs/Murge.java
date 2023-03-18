package Roughs;

public class Murge {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9,289,2903,9330,2883,9,9,9,2,4,5,6,6};
		
		int big = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(big<arr[i])
				big = arr[i];
		}
		
		int [] count = new int[big+1];
		
		for (int i = 0; i < arr.length; i++) {
			count[arr[i]]++;
		}
		
		for (int i = 0; i < count.length; i++) {
			if(count[i]!=0)
				System.out.println(i +"------->"+ count[i]);
		}
		
	}

}
